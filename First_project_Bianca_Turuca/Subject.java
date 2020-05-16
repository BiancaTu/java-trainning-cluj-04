package com.company;

public interface Subject {
    void Subscribe(Subscriber sub);

    void unSubscribe(Subscriber sub);

    void notifySubscribers();

    void updateprice(String info);
}
