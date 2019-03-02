package org.sda.algorithms.calculator;

import java.util.Scanner;

public class CalculatorMenu {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Podaj pierwszą liczbę?");
        int first = scanner.nextInt();
        System.out.println("Podaj drugą liczbę?");
        int second = scanner.nextInt();

        System.out.println("Jaką akcję chcesz wywołać?");
        System.out.println("1 - dodawanie");
        System.out.println("2 - mnożenie");


        int action = scanner.nextInt();
        switch (action){
            case 1:
            {
                int wynik = calculator.add(first, second);
                System.out.println("Wynik to: " + wynik);
                break;
            }
            case 2:
            {
                int wynik = calculator.multiply(first, second);
                System.out.println("Wynik to: " + wynik);
                break;
            }
            default: {
                System.out.println("Nie ma takiej akcji");
            }
        }
    }
}
