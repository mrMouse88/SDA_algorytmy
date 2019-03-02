package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.math.BigDecimal;

/**
 * @author marek.sobieraj
 * <p>
 * Zaimplementuj  algorytm, który dla podanej kwoty poda
 * w jaki sposób można wypłacać ją najmniejszą liczbą banknotów i monet.
 * Wejście:
 * W pierwszej linii wejścia znajduje się jedna liczba całkowita D (1 ≤ D ≤ 5),
 * oznaczająca liczbę przypadków do rozważenia. Opis każdego przypadku składa się
 * z jednej linii (np, 50,32).
 * Wyjście:
 * Dla każdego przypadku z wejścia.
 * Twój program powinien wypisać w osobnych liniach liczbę użytych banknotów/monet oraz ich nominał.
 */
public class Exercise5 {
    private static CalcTime CALC_TIME = new CalcTime();

    private static final BigDecimal[] NOMINALS = {
            BigDecimal.valueOf(500.0),
            BigDecimal.valueOf(200.0),
            BigDecimal.valueOf(100.0),
            BigDecimal.valueOf(50.0),
            BigDecimal.valueOf(20.0),
            BigDecimal.valueOf(10.0),
            BigDecimal.valueOf(5.0),
            BigDecimal.valueOf(2.0),
            BigDecimal.valueOf(1.0),
            BigDecimal.valueOf(0.50),
            BigDecimal.valueOf(0.20),
            BigDecimal.valueOf(0.10),
            BigDecimal.valueOf(0.05),
            BigDecimal.valueOf(0.02),
            BigDecimal.valueOf(0.01)
    };

    public static void main(String[] args) {

        // TODO
        // Pobierze od uzytkownika informacje ile przykladow chce sprawdzic
        // Pobierz liczby

        CALC_TIME.start();

        // Rozwiazanie

        CALC_TIME.stop();
        CALC_TIME.display();
    }

    /**
     * TODO
     * metoda powinna wyswietlic zwrocic wynik jak tekst
     * Przykładowy tekst:
     * Wyniki:
     * Kwota503.46:
     * 1x 500.0
     * 1x 2.0
     * 1x 1.0
     * 2x 0.2
     * 1x 0.05
     * 1x 0.01
     */
    private static String value(BigDecimal value) {
        return "";
    }
}
