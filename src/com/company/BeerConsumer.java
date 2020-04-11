package com.company;
import java.util.Random;

public class BeerConsumer implements Runnable {

    private String name;
    private BeerHouse beerHouse;

    public BeerConsumer (String name, BeerHouse beerHouse){
        this.beerHouse = beerHouse;
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
            if(beerHouse.beers > 0){
                Random ran = new Random();
                int sold = ran.nextInt(3) + 1;
                System.out.println(name+": I want "+sold+ " beer.");
                beerHouse.consumeBeer(sold);

                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("Stock is null :c");
                System.exit(0);
            }
        }
    }
}


