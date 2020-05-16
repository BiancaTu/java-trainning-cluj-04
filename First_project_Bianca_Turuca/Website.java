package com.company;

import java.util.ArrayList;
import java.util.List;

public class Website implements Subject {

    private List<Subscriber> subs = new ArrayList<>();
    String info;

    @Override
    public void Subscribe(Subscriber sub) {
        subs.add(sub);

    }

    @Override
    public void unSubscribe(Subscriber sub) {
        subs.remove(sub);
    }

    @Override
    public void notifySubscribers() {

        for (Subscriber sub : subs) {
            sub.update();
        }


    }
    @Override
    public void updateprice(String info){

        this.info= info;
        notifySubscribers();
    }
}
