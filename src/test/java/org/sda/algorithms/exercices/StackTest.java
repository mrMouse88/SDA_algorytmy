package org.sda.algorithms.exercices;

import org.assertj.core.internal.bytebuddy.build.ToStringPlugin;
import org.junit.jupiter.api.Test;
import org.sda.algorithms.exercises.Stack;

import static org.assertj.core.api.Assertions.assertThat;

public class StackTest {


    @Test // annotacja mówiąca że to będzie metoda testowa
    public void testStackSize(){
        // W tym teście sprawdzać będziemy czy rozmiar stacka jest prawidłowy po przeprowadzonych na nim operacjach.

        // GIVEN - określa warunki początkowe
        // Przygotowywujemy daną testówą w tym przypadku zmienną typu Integer o wartości 34.
        Integer integer = 34;
        // Przygotowywujemy obiekt typu Stack() -> Stos -> który będzie testowany
        Stack stack = new Stack();

        // WHEN - opisuje akcje
        // Wykonujemy akcję -> Dodajemy do stosu zmienną typu integer, powiększamy stack poprzez dodanie do niego naszej zmiennej.
        stack.push(integer);

        // THEN - informuje o oczekiwanych rezultatach
        // Sprawdzamy CZY -> assertThat -> rozmiar stacka jest równy -> isEqualTo -> 1. Jeśli tak, to true i test wykona się poprawnie.
        assertThat(stack.size()).isEqualTo(1);
    }

    @Test
    public void testGettingObjectFromStack(){
        // W tym teście sprawdzać będziemy czy wyjęta ze stacka wartość to ta z wierzchu
        // i czy rozmiar stacka zostaje pomniejszony o ilość wyjętych wartości.

        // GIVEN -> Przygotowywujemy
        // Zmienna typu Integer równa 34
        Integer integer = 34;
        // Zmienna typu string równa "value"
        String someValue = "value";
        // Stack który będziemy testować
        Stack stack = new Stack();

        // WHEN -> Wykonujemy akcję
        // Dodajemy do stacka zmienną integer.
        stack.push(integer);
        // Dodajemy do stacka zmienną someValue
        stack.push(someValue);

        // THEN sprawdzamy czy rozmiar stacka jest równy 2! potrzebne do wykonania testu.
        assertThat(stack.size()).isEqualTo(2);

        // WHEN Tworzymy nowy obiekt wyjmując ostatnią włożoną do stacka wartość -> w naszym przypadku to będzie someValue
        Object result = stack.pop();

        // THEN
        // Sprawdzamy czy wyjęta ze stacka wartość równa jest zmiennej someValue -> Tą ostatnią włożyliśmy
        assertThat(result).isEqualTo(someValue);
        // Sprawdzamy czy rozmiar naszego stacka jest równy jeden, ponieważ usunęliśmy z niego jedną wartość poprzez pop.
        assertThat(stack.size()).isEqualTo(1);
    }

    @Test
    public void testFull(){
        // Ten test za zadanie ma sprawdzenie czy Stack prawidłowo obsługuje zwrócenie informacji o tym czy jest pełny.
        // STACK ma mieścić maksymalnie 10 wartości.

        // GIVEN -> Obiekt stacka który będziemy testować
        Stack stack = new Stack();

        // WHEN -> Petlą for wypełniamy Stack 10 wartościami
        for(int i=0; i<10; i++){
            stack.push(i);
        }

        // THEN
        // Sprawdzamy czy rozmiar stacka jest równy 10 -> Tyle wartości włożyliśmy do niego.
        assertThat(stack.size()).isEqualTo(10);
        // Sprawdzamy czy dla stacka maksymalna ilość wartości to ta którą go wypełniliśmy w tym teście
        // Porównując czy metoda isFull() zwraca true
        assertThat(stack.isFull()).isEqualTo(true);

    }

    @Test
    public void testAddMoreThanStackSize(){
        // Test sprawdza czy jest możliwość dodania więcej niż MAX -> 10 wartości do stacka.

        // GIVEN -> Obiekt stacka do testów
        Stack stack = new Stack();

        // WHEN -> Próbujemy wypełnić STACK 11 wartościami.
        for(int i=0; i<11; i++){
            stack.push(i);
        }

        // THEN
        // Sprawdzamy czy rozmiar stacka jest równy 10 -> Tyle wartości maksymalnie może być przechowywane w Stacku.
        assertThat(stack.size()).isEqualTo(10);
        // Sprawdzamy czy dla stacka maksymalna ilość wartości została osiągnięta
        // Porównując czy metoda isFull() zwraca true
        assertThat(stack.isFull()).isEqualTo(true);

    }

    @Test
    public void testPeek(){

        Stack stack = new Stack();

        String string = "SDA";
        stack.push(string);

        Object result = stack.peek();

        assertThat(result).isEqualTo(string);
        assertThat(stack.size()).isEqualTo(1);
    }

    @Test
    public void getMoreThanIsOnStack(){
        Stack stack = new Stack();

        String string = "SDA";
        stack.push(string);

        Object result1 = stack.pop();
        Object result2 = stack.pop();

        assertThat(result1).isEqualTo(string);
        assertThat(result2).isEqualTo(null);

        assertThat(stack.size()).isEqualTo(0);
    }
}
