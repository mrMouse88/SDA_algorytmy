package org.sda.algorithms.exercises;

public class Stack {

    private int maxSize = 10;
    // tablica w której będziemy trzymać obiekty
    private Object[] objectOnStack = new Object[maxSize];
    // rozmiar stosu
    private int size = 0;

    public Stack() {
    }

    // Dodatkowo:
    // Drugi kontruktor który bedzie przyjmowal rozmiar stosu

    public void push(Object o){

        // sprawdzamy czy size przekroczyl maksymalny rozmiar stosu

        /*
        if(size < maxSize) {
            objectOnStack[size] = o;
            size++;
            // skrócona wersja
            // objectOnStack[size++] = o;

        } else {
            System.out.println("Przekroczyłeś rozmiar stosu. Element nie zostanie dodany");
        }

        */

        if(isFull()){
            System.out.println("Przekroczyłeś rozmiar stosu. Element nie zostanie dodany");
        } else {
            objectOnStack[size] = o;
            size++;
        }

        // rozmiar jest zawsze o jeden większy niż ostatni index
        // jeśli wrzuciliśmy coś pod index = 0 to rozmiar wynosi 1
    }

    public Object pop(){

        if(isEmpty()){
            System.out.println("Stos pusty");
            return null;
        } else {
            Object o = objectOnStack[size - 1]; //sciagamy ostatni element, index jest o 1 mniejszy niz rozmiar
            objectOnStack[size - 1] = null;
            size--;
            return o;
        }
    }

    public Object peek(){
        return objectOnStack[size - 1];
    }

    public boolean isFull(){
        return size == maxSize;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

}
