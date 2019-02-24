package org.sda.algorithms.exercises;


import org.sda.algorithms.util.CalcTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * mark
 * <p>
 * Exercise:
 * W pętli pobierz od użytkownika 5 imion. Wykorzystaj do tego listę.
 * Następnie wyświetl w konsoli zapisane imiona na liście.
 */
public class Exercise1 {
    private static CalcTime CALC_TIME = new CalcTime();

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        try {

            for (int i = 0; i < 5; i++) {
                System.out.println("Podaj imię:");
                names.add(scanner.next());
            }
        }
        finally {
            scanner.close();
        }

        CALC_TIME.start();

        for (String name : names){
            System.out.println(name);
        }

        for (String name : names){
            if(name.charAt(0) == 'A' || name.charAt(0) == 'a'){
                for (int i = name.length()-1; i >= 0; i--) {
                    System.out.print(name.charAt(i));
                }
                System.out.println();
            }
        }

        CALC_TIME.stop();
        CALC_TIME.display();
    }
}
