package org.sda.algorithms.exercises;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

    private static int[] bubbleSort(int[] intArray) {
        for (int i = 0; i < intArray.length-1; i++) {
            for (int j = 0; j < intArray.length - 1 - i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j + 1];
                    intArray[j + 1] = intArray[j];
                    intArray[j] = temp;
                }
//                printArray(intArray);
//                System.out.println();
            }
//            System.out.println("--------------------------------");
        }
        return intArray;
    }

    private static int[] userIntArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczby oddzielone przecinkami");
        String[] StringArray = input.nextLine().split(",");
        int[] intArray = new int[StringArray.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.valueOf(StringArray[i]);
        }
        return intArray;
    }

    private static int[] randomIntArray(int min, int max, int size) {
        Random rand = new Random();
        int[] intArray = new int[size];
        for (int i = 0; i < size; i++) {
            intArray[i] = min + rand.nextInt((max - min) + 1);
        }
        return intArray;
    }

    private static void printArray(int[] intArray) {
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
//        int[] myArray = randomIntArray(10,100,20);
        int[] myArray = userIntArray();
        printArray(myArray);
        System.out.println();
        printArray(bubbleSort(myArray));
    }
}
