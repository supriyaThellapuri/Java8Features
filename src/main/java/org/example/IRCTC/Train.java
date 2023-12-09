package org.example.IRCTC;

public class Train {
    public String trainName;
    public int noOfBookings;

    public Train(String trainName, int noOfBookings) {
        this.trainName = trainName;
        this.noOfBookings = noOfBookings;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getNoOfBookings() {
        return noOfBookings;
    }

    public void setNoOfBookings(int noOfBookings) {
        this.noOfBookings = noOfBookings;
    }
}
