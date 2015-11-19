package com.ge.toolstracker.model;

/**
 * Created by £ukasz on 2015-11-16.
 */
public class ToolInventory {

    public enum Status { ORDERED, SHIPPED_TO, ON_SITE, SHIPPED_BACK, IN_STOCK }

    private int mTISerial;
    private Status mTIStatus;
    private int mTIAcquisitionDate;

    public ToolInventory(int mTIAcquisitionDate, int mTISerial, Status mTIStatus) {
        this.mTIAcquisitionDate = mTIAcquisitionDate;
        this.mTISerial = mTISerial;
        this.mTIStatus = mTIStatus;
    }

    public int getmTIAcquisitionDate() {
        return mTIAcquisitionDate;
    }

    public void setmTIAcquisitionDate(int mTIAcquisitionDate) {
        this.mTIAcquisitionDate = mTIAcquisitionDate;
    }

    public int getmTISerial() {
        return mTISerial;
    }

    public void setmTISerial(int mTISerial) {
        this.mTISerial = mTISerial;
    }

    public Status getmTIStatus() {
        return mTIStatus;
    }

    public void setmTIStatus(Status mTIStatus) {
        this.mTIStatus = mTIStatus;
    }
}
