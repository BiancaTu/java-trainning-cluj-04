package com.company;

public class Main {

    public static void main(String[] args) {

        OperatingFactory of = new OperatingFactory();
        TravelTicket obj1 = of.getInstance("Slow");
        //depending on the requirement, it will respond with the type of travel
        obj1.spec();

        Website Travel = new Website();

        Subscriber s1= new Subscriber("Andrei");
        Subscriber s2= new Subscriber("Ioana");

        Travel.Subscribe(s1);
        Travel.Subscribe(s2);

        s1.subscribeWebsite(Travel);
        s2.subscribeWebsite(Travel);

        Travel.updateprice("Bus travel is 25 % off!");

    }
}
