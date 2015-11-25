package com.ge.toolstracker.model;

/**
 * Created by lukasz on 2015-11-16.
 */
public class Request {



    public enum Severity { LOW, MEDIUM, HIGH }
    public enum Status { REGISTERED, SHIPPED, ARRIVED, UNKNOWN }

    private int mRNumber;
    private long mRDate;
    private String mRClient;
    private String mRLocation;
    private int mRFFEM;
    private int mRFE;
    private Severity mRSeverity;
    private Status mRStatus;



    public Request(String mRClient, long mRDate, int mRFE, int mRFFEM, String mRLocation, int mRNumber, Severity mRSeverity, Status mRStatus) {
        this.mRClient = mRClient;
        this.mRDate = mRDate;
        this.mRFE = mRFE;
        this.mRFFEM = mRFFEM;
        this.mRLocation = mRLocation;
        this.mRNumber = mRNumber;
        this.mRSeverity = mRSeverity;
        this.mRStatus = mRStatus;
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

    public void setmRStatus(Status mRStatus) {
        this.mRStatus = mRStatus;
    }

    public Status getmRStatus() {
        return mRStatus;
    }

}
