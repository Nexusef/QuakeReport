package com.example.android.quakereport;

public class Earthquake {

    // Earthquake Magnitude
    private final double mMagnitude;

    // Earthquake Location
    private final String mLocation;

    // Earthquake Date
    private final long mTimeInMilliseconds;

    // Create a new Earthquake object
    public Earthquake(double magnitude, String location, long TimeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = TimeInMilliseconds;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

}
