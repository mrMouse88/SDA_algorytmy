package org.sda.algorithms.house;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> listOfHouse = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            House h = new House();
            h = h.generateRandomHouse();
            listOfHouse.add(h);
        }

        for (House house : listOfHouse) {
            System.out.println(house.toString());
        }
        System.out.println();
        System.out.println("By price");
        for (House house : bubbleSort(listOfHouse, 0)) {
            System.out.println(house.toString());
        }


        System.out.println();
        System.out.println("By size");
        for (House house : bubbleSort(listOfHouse, 1)) {
            System.out.println(house.toString());
        }

        System.out.println();
        System.out.println("By rooms");
        for (House house : bubbleSort(listOfHouse, 2)) {
            System.out.println(house.toString());
        }
    }

    private static List<House> bubbleSortPrice(List<House> listOfHouse) {

        for (int i = 0; i < listOfHouse.size() - 1; i++) {
            for (int j = 0; j < listOfHouse.size() - 1 - i; j++) {
                if (listOfHouse.get(j).getPrice().compareTo(listOfHouse.get(j + 1).getPrice()) == 1) {
                    House temp = listOfHouse.get(j);
                    listOfHouse.set(j, listOfHouse.get(j + 1));
                    listOfHouse.set(j + 1, temp);
                }
            }
        }
        return listOfHouse;
    }

    private static List<House> bubbleSort(List<House> listOfHouse, int field) {

        for (int i = 0; i < listOfHouse.size() - 1; i++) {
            for (int j = 0; j < listOfHouse.size() - 1 - i; j++) {
                if (field == 0) {
                    if (listOfHouse.get(j).getPrice().compareTo(listOfHouse.get(j + 1).getPrice()) == 1) {
                        House temp = listOfHouse.get(j);
                        listOfHouse.set(j, listOfHouse.get(j + 1));
                        listOfHouse.set(j + 1, temp);
                    }
                } else if (field == 1) {
                    if (listOfHouse.get(j).getSize().compareTo(listOfHouse.get(j + 1).getSize()) == 1) {
                        House temp = listOfHouse.get(j);
                        listOfHouse.set(j, listOfHouse.get(j + 1));
                        listOfHouse.set(j + 1, temp);
                    }
                } else if (field == 2) {
                    if (listOfHouse.get(j).getRooms().compareTo(listOfHouse.get(j + 1).getRooms()) == 1) {
                        House temp = listOfHouse.get(j);
                        listOfHouse.set(j, listOfHouse.get(j + 1));
                        listOfHouse.set(j + 1, temp);
                    }
                }
            }
        }
        return listOfHouse;
    }
}
