package Q2;

public class BigArray {
    public static void main(String[] args) {
        int[] array = new int[19];
        for (int lcv = 0; lcv < 19; lcv++) {
            array[lcv] = (int)(Math.random() * (91 - 20) + 20);
        }

//      Print the Array from the beginning to the end
        for (int lcv = 0; lcv < array.length; lcv++) {
            System.out.print(array[lcv] + " ");
        }
        System.out.println();
//      Print the Array from the beginning to the end using a for-each loop
        for (int temp : array) {
            System.out.print(temp + " ");
        }
        System.out.println();
//      What number is in the middle of the Array?
        System.out.println("The middle number is " + array[array.length / 2]);
//      What is the average of the first, last and middle numbers?
        double average = (array[0] + array[array.length-1] + array[array.length / 2]) / 3;
        System.out.println("Average of the first, middle, and last numbers is " + average);
//      Find the smallest and the largest number in the Array
        int smallest = array[0];
        int largest = array[0];
        for (int num : array) {
            if (num < smallest) { smallest = num; }
            if (num > largest) { largest = num;}
        }
        System.out.println("The smallest number is " + smallest);
        System.out.println("The largest number is " + largest);
//      Switch the largest with the smallest number. Print the list
        for (int lcv = 0; lcv < array.length; lcv++) {
            if(array[lcv] == smallest) {
                array[lcv] = largest;
            }
            if(array[lcv] == largest) {
                array[lcv] = smallest;
            }
        }
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " ");
        }
        System.out.println();
//      Create a new random from 1 to 10 and insert it in the middle slot. Print the numbers.
        int randOneToTen = (int)(Math.random() * (11 - 1) + 1);
        array[array.length/2] = randOneToTen;
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " ");
        }
        System.out.println();
//      Add 10 to every number in the List. Print all.
        for (int lcv = 0; lcv < array.length; lcv++) {
            array[lcv] += 10;
            System.out.print(array[lcv] + " ");
        }
        System.out.println();
//      Replace the 3rd element in the array with 5 and print the number that was ousted (only use one method to complete this.)
        int array3rd = array[2];
        array[2] = 5;
        System.out.println("The number that was ousted was " + array3rd);
//      What numbers are in the 50s?
//      What numbers are multiples of 4?
//      Is there a 60 in the list?
//      Check to see if all of the elements from front to back are in the same order from back to front
//      How many numbers are greater than the average?
//      How many of the numbers are even?
//      Copy all of the elements of the array into a new array but in reverse order
//      Write a program to shift every element of an array circularly right. E.g.-INPUT : 1 2 3 4 5 OUTPUT : 5 1 2 3 4
//      Find the sum of all of the digits of all of the elements

    }
}
