package org.sda.algorithms.remider;


import java.util.*;

/**
 * Różnica między HashSet a List
 */
public class Reminder {

    public static void main(String[] args) {

        /**
         * Przykład polimorfizmu. HashSet może występować w kodzie jako Set i przejąć jego zachowanie
         *
         * metoda printUsingStream korzysta z tego, że zarówno Set jak i List dziedziczą po Collection.
         * Jako argument przyjmuje tym collection, zarówno fruitsSet jak i fruitsList może być argumentem tej metody
         */

        Set<String> fruitsSet = new HashSet<String>();
        List<String> fruitsList = new ArrayList<String>();

        String apple = "apple";
        String secondApple = "apple";
        String orange = "orange";

        // dodajemy alementy do set
        fruitsSet.add(apple);
        fruitsSet.add(secondApple);
        fruitsSet.add(orange);

        // dodajemy elementy do listy
        fruitsList.add(apple);
        fruitsList.add(secondApple);
        fruitsList.add(orange);

        /*
        fruitsList
                .stream()
                .forEach(System.out::println);

        fruitsSet
                .stream()
                .forEach(System.out::println);
         */

        System.out.println("Printing using stream");
        printUsingStream(fruitsList);
        System.out.println("++");
        printUsingStream(fruitsSet);
        System.out.println("++");

        System.out.println("Printing using for loop");
        printUsingFor(fruitsList);
        System.out.println("--");
        printUsingForEach(fruitsSet);
        System.out.println("--");

        System.out.println("Printing using iterator");
        printUsingIterator(fruitsList);
        System.out.println("//");
        printUsingIterator(fruitsSet);
        System.out.println("//");
    }

    // metoda przyjmuje kolekcje
    // lista jest kolekcja
    // set tez jest kolekcja
    // w ciele metody mamy dostep do zmiennych ktore przekzalismy
    private static void printUsingStream(Collection<String> fruitsCollection) {
        fruitsCollection
                .stream()
                .forEach(System.out::println);
    }

    /**
     * TODO
     * Napisz metodę która wykorzysta for
     */
    public static void printUsingFor(List<String> list) {
        for(int i=0; i < list.size(); i++){
            String s = list.get(i);
            System.out.println(s);
        }
    }

    public static void printUsingForEach(Collection<String> set) {
        for(String s: set){
            System.out.println(s);
        }
    }

    /**
     * TODO
     * Skorzystaj z pętli while
     */
    public static void printUsingIterator(Collection<String> fruitsCollection){
        Iterator<String> fruitIterator = fruitsCollection.iterator();
        while (fruitIterator.hasNext()){
            String s = fruitIterator.next();
            System.out.println(s);
        }

    }

}
