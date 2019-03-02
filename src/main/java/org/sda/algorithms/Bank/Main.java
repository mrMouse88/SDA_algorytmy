package org.sda.algorithms.Bank;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account user = new Account(BigDecimal.valueOf(0.0));
        boolean status = true;
        Scanner input = new Scanner(System.in);
        while (status) {
            printMenu();
            int menuPos = input.nextInt();
            input.nextLine();
            switch (menuPos) {
                case 1:
                    System.out.println("You have: " + user.getBalance());
                    break;
                case 2:
                    System.out.println("input nominal:");
                    BigDecimal nominal = BigDecimal.valueOf(input.nextDouble());
                    input.nextLine();
                    System.out.println("input quantity:");
                    int quantity = input.nextInt();
                    input.nextLine();
                    user.addAmount(nominal, quantity);
                    break;
                case 3:
                    System.out.println("input amount:");
                    BigDecimal amount = BigDecimal.valueOf(input.nextDouble());
                    user.withdraw(amount);
                    break;
                case 4:
                    System.out.println("Good day!");
                    status = false;
                    break;
                default:
                    System.out.println("I said choose wisely!");

            }
        }
    }

    private static void printMenu() {
        System.out.println("-------------------------------");
        System.out.println("Menu:");
        System.out.println(1 + ". Show balance");
        System.out.println(2 + ". Add");
        System.out.println(3 + ". Withdrow");
        System.out.println(4 + ". Exit");
        System.out.println("Choose wisely:");
    }
}
