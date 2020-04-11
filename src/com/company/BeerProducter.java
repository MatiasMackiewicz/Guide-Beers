package com.company;

public class BeerProducter implements Runnable {

    private BeerHouse beerHouse;

    public BeerProducter(BeerHouse beerHouse) {
        this.beerHouse = beerHouse;
    }

    @Override
    public synchronized void run() {
        int newBeersAmount = 100;
        while(true){
            if(newBeersAmount >= 10){
                System.out.println("BeerHouse Previus Stock: "+beerHouse.beers + " Beers in the kitchen: "+newBeersAmount);
                beerHouse.rechargeBeer(newBeersAmount);
                newBeersAmount = 0;
            }
            newBeersAmount++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
