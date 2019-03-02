package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.Scanner;

/**
 * @author marek.sobieraj
 * <p>
 * Napisz program, który sprawdza czy liczba jest pierwsza.
 * Wejśćie:
 * W pierwszej linii 𝑛 ∈ ℕ - liczba testów, w kolejnych liniach n liczb z przedziału [1…100000]
 * <p>
 * Wyjście:
 * Dla każdej liczby słowo TAK, jeśli pierwsza; NIE w p.p.
 */
public class Exercise3 {
    private static CalcTime CALC_TIME = new CalcTime();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // TODO
        // Pobierze od uzytkownika informacje ile przykladow chce sprawdzic
        // Pobierz liczny
        System.out.println("Ile testów:");
        int x = scanner.nextInt();
        int[] intArray = new int[x];
        scanner.nextLine();

        for (int i = 0; i < x; i++) {
            System.out.println("Podaj liczbę "+(i+1));
            intArray[i] = scanner.nextInt();
            scanner.nextLine();
        }

        CALC_TIME.start();

        // TODO
        // Sprawdz czy liczba jest pierwsza uzywajac metody isPrime
        for (int i : intArray){
            if(isPrime(i)==true){
                System.out.println("TAK");
            }else{
                System.out.println("NIE");
            }
        }

        CALC_TIME.stop();
        CALC_TIME.display();
    }

    // TODO
    // zaimplementuj metode ktora zwroci true dla kazdej liczby pierwszej
    // i false dla innych
    public static boolean isPrime(int number) {
        for (int i = 0; i < number; i++) {
            if(number%(i+2)==0){
                if(number==i+2){
                    return true;
                }else {
                    return false;
                }
            }
        }
        return false;
    }
}
