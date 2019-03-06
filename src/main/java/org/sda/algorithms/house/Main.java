package org.sda.algorithms.house;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> listOfHouse = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            House h = new House();
            h = h.generateRandomHome();
            listOfHouse.add(h);
        }

        for (House house : listOfHouse){
            System.out.println(house.toString());
        }
        listOfHouse = bubbleSortPrice(listOfHouse);

        System.out.println();
        for (House house : listOfHouse){
            System.out.println(house.toString());
        }
    }

    private static List<House> bubbleSortPrice(List<House> listOfHouse){

        for (int i = 0; i < listOfHouse.size()-1; i++) {
            for (int j = 0; j < listOfHouse.size()-1-i; j++) {
                if(listOfHouse.get(j).getPrice().compareTo(listOfHouse.get(j+1).getPrice())==1){
                    House temp = listOfHouse.get(j);
                    listOfHouse.set(j, listOfHouse.get(j+1));
                    listOfHouse.set(j+1, temp);
                }
            }
        }
        return listOfHouse;
    }
}
