package com.example.android.quakereport;

public class Earthquake {

    // Earthquake Magnitude
    private String mMagnitude;

    // Earthquake Location
    private String mLocation;

    // Earthquake Date
    private String mDate;

    // Create a new Earthquake object
    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
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
