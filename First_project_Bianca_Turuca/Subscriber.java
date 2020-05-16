package com.company;

public class Subscriber implements Observer {

    private String name;
    private Website TravelPromo = new Website();

    public Subscriber(String name) {
        super ();
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Price update"+ ":" + TravelPromo.info);
    }

    @Override
    public void subscribeWebsite(Website Wb){

        TravelPromo= Wb;
    }
}
