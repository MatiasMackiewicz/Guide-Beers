package com.company;

public class Main {

    public static void main(String[] args) {
        BeerHouse beerHouse = new BeerHouse();

        Thread beerProducer = new Thread(new BeerProducter(beerHouse));
        Thread beerConsumer0 = new Thread(new BeerConsumer("Pablo",beerHouse));
        Thread beerConsumer1 = new Thread(new BeerConsumer("Zoe",beerHouse));
        Thread beerConsumer2 = new Thread(new BeerConsumer("Julian",beerHouse));
        Thread beerConsumer3 = new Thread(new BeerConsumer("Matias",beerHouse));

        beerProducer.start();
        beerConsumer0.start();
        beerConsumer1.start();
        beerConsumer2.start();
        beerConsumer3.start();
    }
}
