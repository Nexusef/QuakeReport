package com.example.android.quakereport;

public class Earthquake {

    // Earthquake Magnitude
    private final double mMagnitude;

    // Earthquake Location
    private final String mLocation;

    // Earthquake Date
    private final long mTimeInMilliseconds;

    // Earthquake URL
    private final String mURL;

    // Create a new Earthquake object
    public Earthquake(double magnitude, String location, long TimeInMilliseconds, String URL) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = TimeInMilliseconds;
        mURL = URL;
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

    public String getURL() {
        return mURL;
    }
}
