package Q2.ArrayListLab;

public class IntArrayList {
    private int[] myArray;
    private int mySize;
    private int myCapacity;
    private final int DEFAULT_SIZE = 16;

    public IntArrayList() {
        myArray = new int[DEFAULT_SIZE];
        mySize = 0;
        myCapacity = DEFAULT_SIZE;
    }

    private void doubleCapacity() {
        myCapacity *= 2;
        int[] temp = new int[myCapacity];
        for (int lcv = 0; lcv < mySize; lcv++) {
            temp[lcv] = myArray[lcv];
        }
        myArray = temp;
    }

    private void halfCapacity() {
        myCapacity /= 2;
        int[] temp = new int[myCapacity];
        for (int lcv = 0; lcv < mySize; lcv++) {
            temp[lcv] = myArray[lcv];
        }
        myArray = temp;
    }

    public void add(int num) {
        if (mySize + 1 == myCapacity) {
            doubleCapacity();
        }
        myArray[mySize] = num;
        mySize++;
    }

    public void remove(int index) {
        for (int lcv = index + 1; lcv < mySize; lcv++) {
            myArray[lcv-1] = myArray[lcv];
        }
        mySize--;
        if (mySize <= myCapacity * 0.25) {
            halfCapacity();
        }
    }

    public int get(int index) {
        return myArray[index];
    }

    public void set(int index, int num) {
        myArray[index] = num;
    }

    public int size() {
        return mySize;
    }

    public int[] toArray() {
        return myArray;
    }
    public int indexOf(int num) {
        for (int lcv = 0; lcv < mySize; lcv++) {
            if (myArray[lcv] == num) {
                return lcv;
            }
        }
        return -1;
    }
}
/*
Testing add() and get()...
list.get(0) = 0
list.get(1) = 1
list.get(2) = 2
list.get(3) = 3
list.get(4) = 4
list.get(5) = 5
list.get(6) = 6
list.get(7) = 7
list.get(8) = 8
list.get(9) = 9

Testing set()...
list.get(0) = 0
list.get(1) = 2
list.get(2) = 4
list.get(3) = 6
list.get(4) = 8
list.get(5) = 10
list.get(6) = 12
list.get(7) = 14
list.get(8) = 16
list.get(9) = 18

Testing remove()...
list.get(0) = 2
list.get(1) = 4
list.get(2) = 6
list.get(3) = 10
list.get(4) = 12
list.get(5) = 14
list.get(6) = 18

Testing indexOf()...
list.indexOf(4) = 1
list.indexOf(3) = -1
list.indexOf(5) = -1
list.indexOf(2) = 0
list.indexOf(16) = -1
list.indexOf(7) = -1
list.indexOf(4) = 1
list.indexOf(9) = -1
list.indexOf(15) = -1
list.indexOf(11) = -1
 */
