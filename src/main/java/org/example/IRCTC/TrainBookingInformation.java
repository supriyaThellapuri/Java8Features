package org.example.IRCTC;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainBookingInformation {
    public static void main(String[] args) {
        List<Train> trains = new ArrayList<>();
        trains.add(new Train("Kachiguda Express", 1000));
        trains.add(new Train("East-coach Express", 2000));
        trains.add(new Train("Vishaka Express", 3000));
        trains.add(new Train("Chennai Express", 4000));
        trains.add(new Train("Pune Bhuvaneswar Express", 5000));
        trains.add(new Train("Hyderabad Cuttak", 6010));
        Train mostBookings = trains.stream().max(Comparator.comparingInt(Train::getNoOfBookings)).orElse(null);
        if(mostBookings != null)
        {
            System.out.println("The train with the most booking is :"+ mostBookings.getTrainName());
            System.out.println(mostBookings.getNoOfBookings());
        }
        else
        {
            System.out.println("No train booked");
        }

    }
}
