package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.Arrays;

/**
 * mark
 * <p>
 * Stwórz tablicę posiadającą 10 elementów, które są liczbami typu int.
 * Wyświetl w pętli zawartość listy.
 * Następnie odwróć kolejność zapisanych elementów w tablicy.
 * Wyświetl ponownie zawartość.
 */
public class Exercise2 {
    private static CalcTime CALC_TIME = new CalcTime();

    public static void main(String[] args) {

        CALC_TIME.start();

        int[] numb = new int[10];

        for (int i = 0; i < 10; i++) {
            numb[i] = i + 1;
        }

        printArray(numb);
//        numb = reverseArray(numb);
        numb = betterReverseArray(numb);
        printArray(numb);

        CALC_TIME.stop();
        CALC_TIME.display();
    }


    /**
     * TODO
     * napisz implementacje ktora wydrukuje liste w konsoli
     */
    private static void printArray(int[] numbers) {
        for (int x : numbers) {
            System.out.println(x);
        }
    }

    private static int[] reverseArray(int[] numbers) {
        int[] reverse = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reverse[i] = numbers[numbers.length - 1 - i];
        }
        return reverse;
    }

    private static int[] betterReverseArray(int[] numbers) {
        for(int i = 0; i < numbers.length / 2; i++)
        {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        return numbers;
    }
}
