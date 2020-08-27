package com.example.android.quakereport;

public class Earthquake {

    //Earthquake Magnitude
    private float mMagnitude;

    //Earthquake Location
    private String mLocation;

    //Earthquake Date
    private int mDate;

    //Create a new Earthquake object
    public Earthquake(float magnitude, String location, int date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public float getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public int getDate() {
        return mDate;
    }

    @Override
    public String toString() {
        return "Earthquake{" +
                "mMagnitude=" + mMagnitude +
                ", mLocation='" + mLocation + '\'' +
                ", mDate=" + mDate +
                '}';
    }
}
