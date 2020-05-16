package com.company;

public class OperatingFactory {

    public TravelTicket getInstance(String str) {

        if (str.equals("Cheap")){
            return new BusTravel();
        }
       else if (str.equals("Slow")){
            return new TrainTravel();
        }
        else if (str.equals("Fast")){
            return new PlaneTravel();
        }
        else {
            return new PlaneTravel();
        }
    }

}



