package com.ge.toolstracker.model;

/**
 * Created by £ukasz on 2015-11-16.
 */
public class Request {

    public enum Severity { LOW, MEDIUM, HIGH }

    private int mRNumber;
    private long mRDate;
    private String mRClient;
    private String mRLocation;
    private int mRFFEM;
    private int mRFE;
    private Severity mRSeverity;

    public Request(String mRClient, long mRDate, int mRFE, int mRFFEM, String mRLocation, int mRNumber, Severity mRSeverity) {
        this.mRClient = mRClient;
        this.mRDate = mRDate;
        this.mRFE = mRFE;
        this.mRFFEM = mRFFEM;
        this.mRLocation = mRLocation;
        this.mRNumber = mRNumber;
        this.mRSeverity = mRSeverity;
    }

    public String getmRClient() {
        return mRClient;
    }

    public void setmRClient(String mRClient) {
        this.mRClient = mRClient;
    }

    public long getmRDate() {
        return mRDate;
    }

    public void setmRDate(long mRDate) {
        this.mRDate = mRDate;
    }

    public int getmRFE() {
        return mRFE;
    }

    public void setmRFE(int mRFE) {
        this.mRFE = mRFE;
    }

    public int getmRFFEM() {
        return mRFFEM;
    }

    public void setmRFFEM(int mRFFEM) {
        this.mRFFEM = mRFFEM;
    }

    public String getmRLocation() {
        return mRLocation;
    }

    public void setmRLocation(String mRLocation) {
        this.mRLocation = mRLocation;
    }

    public int getmRNumber() {
        return mRNumber;
    }

    public void setmRNumber(int mRNumber) {
        this.mRNumber = mRNumber;
    }

    public Severity getmRSeverity() {
        return mRSeverity;
    }

    public void setmRSeverity(Severity mRSeverity) {
        this.mRSeverity = mRSeverity;
    }
}
