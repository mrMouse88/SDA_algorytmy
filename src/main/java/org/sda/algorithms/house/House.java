package org.sda.algorithms.house;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class House {
    final double MIN_PRICE = 100000.0;
    final double MAX_PRICE = 1000000.0;
    final int MIN_SIZE = 10;
    final int MAX_SIZE = 1000;
    final int MIN_ROOM = 1;
    final int MAX_ROOM = 10;

    BigDecimal price;
    int size;
    int rooms;

    public House(){}

    public House(BigDecimal price, int size, int rooms) {
        this.price = price;
        this.size = size;
        this.rooms = rooms;
    }

    public BigDecimal getPrice() {
        return price;
    }

    protected House generateRandomHouse(){
        Random r = new Random();
        double randomPrice = MIN_PRICE + (MAX_PRICE - MIN_PRICE) * r.nextDouble();
        int randomSize = MIN_SIZE + r.nextInt((MAX_SIZE - MIN_SIZE) + 1);
        int randomRoom = MIN_ROOM + r.nextInt((MAX_ROOM - MIN_ROOM) + 1);

       return new House(new BigDecimal(randomPrice).setScale(2, RoundingMode.HALF_UP), randomSize, randomRoom);
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                ", size=" + size +
                ", rooms=" + rooms +
                '}';
    }
}
