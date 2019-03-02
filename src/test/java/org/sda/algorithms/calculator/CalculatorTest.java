package org.sda.algorithms.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test // adnotacja, mówimy że w tej metodzie jest kod z testem
    public void testAdd(){

        // żeby przetestować metodę add musimy mieć stworzony obiekt
        Calculator calculator = new Calculator();

        // potrzebujemy dane do metody add
        int firstNumber = 5;
        int secondNumber = 60;

        // sprawdzamy czy nasz kalkulator da wynik 65
        // musimy wcześniej wiedzieć, że wynik oddawania 60 i 5 to 65
        assertThat(calculator.add(firstNumber, secondNumber)).isEqualTo(65);
    }
}
