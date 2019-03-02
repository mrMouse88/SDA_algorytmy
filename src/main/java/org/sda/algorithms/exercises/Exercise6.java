package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

/**
 * @author marek.sobieraj
 * <p>
 * Zaimplementuj algorytm, który sprawdzi czy podany rok
 * jest przestępny czy nie.
 * Wejście:
 * W pierwszej linii wejścia znajduje się liczba całkowida D (1 <= D <= 5 )
 * oznaczająca liczbę przypadków do rozwiązania. Opis każdego
 * przypadku składa się z jednej linii - rok r ∈ ℕ
 * Wyjście:
 * Dla każdego przestępnego roku słowo TAK; NIE w p.p.
 */
public class Exercise6 {
    private static CalcTime CALC_TIME = new CalcTime();

    public static void main(String[] args) {


        CALC_TIME.start();

        CALC_TIME.stop();
        CALC_TIME.display();
    }

    private static boolean isLeapYear(int year) {
        return false;
    }
}
