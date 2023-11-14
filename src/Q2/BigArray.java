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
        for (int num : array) {
            if (num >= 50 && num <= 59) { System.out.print(num + " "); }
        }
        System.out.println();

//      What numbers are multiples of 4?
        for (int num : array) {
            if (num % 4 == 0) { System.out.print(num + " "); }
        }
        System.out.println();

//      Is there a 60 in the list?
        boolean is60 = false;
        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] == 60) { is60 = true; }
        }
        System.out.println("Is 60 in the list? " + is60);

//      Check to see if all of the elements from front to back are in the same order from back to front
        boolean palindromic = true;
        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] != array[array.length-(lcv+1)]) {
                palindromic = false;
            }
        }
        System.out.println("Is the list palindromic? " + palindromic);

//      How many numbers are greater than the average?
        average = 0;
        for (int num : array) {
            average += num;
        }
        average /= array.length;
        int aboveAvg = 0;
        for (int num : array) {
            if (num > average) { aboveAvg++; }
        }
        System.out.printf("There are %d numbers greater than the average\n", aboveAvg);

//      How many of the numbers are even?
        int evenCount = 0;
        for (int num : array) {
            if (num % 2 == 0) { evenCount++; }
        }
        System.out.printf("There are %d even numbers\n", evenCount);

//      Copy all of the elements of the array into a new array but in reverse order
        int[] array2 = new int[array.length];
        for (int lcv = 0; lcv < array.length; lcv++) {
            array2[array2.length-(lcv+1)] = array[lcv];
        }

        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

//      Write a program to shift every element of an array circularly right. E.g.-INPUT : 1 2 3 4 5 OUTPUT : 5 1 2 3 4
        int[] shiftArr = circularShiftRight(array);
        for (int num : shiftArr) {
            System.out.print(num + " ");
        }
        System.out.println();

//      Find the sum of all of the digits of all of the elements
        int sum = 0;
        for (int num : array) {
            int digitsum = 0;
            int temp = num;
            while (temp > 0) {
                int n = temp % 10;
                temp /= 10;
                digitsum += n;
            }
            sum += digitsum;
        }
        System.out.println("The sum of all digits of all elements is: " + sum);
    }

    public static int[] circularShiftRight(int[] arr) {
        int temp = arr[arr.length - 1];
        int[] shifted = new int[arr.length];
        for (int lcv = 1; lcv < arr.length; lcv++) {
            shifted[lcv] = arr[lcv-1];
        }
        shifted[0] = temp;
        return shifted;
    }
}
/*
40 87 56 73 54 81 25 58 33 71 45 62 55 42 22 85 69 34 47
40 87 56 73 54 81 25 58 33 71 45 62 55 42 22 85 69 34 47
The middle number is 71
Average of the first, middle, and last numbers is 52.0
The smallest number is 22
The largest number is 87
40 22 56 73 54 81 25 58 33 71 45 62 55 42 22 85 69 34 47
40 22 56 73 54 81 25 58 33 9 45 62 55 42 22 85 69 34 47
50 32 66 83 64 91 35 68 43 19 55 72 65 52 32 95 79 44 57
The number that was ousted was 66
50 55 52 57
32 64 68 72 52 32 44
Is 60 in the list? false
Is the list palindromic? false
There are 10 numbers greater than the average
There are 8 even numbers
57 44 79 95 32 52 65 72 55 19 43 68 35 91 64 83 5 32 50
57 50 32 5 83 64 91 35 68 43 19 55 72 65 52 32 95 79 44
The sum of all digits of all elements is: 177
 */