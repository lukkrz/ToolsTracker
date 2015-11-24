package com.ge.toolstracker.model;

/**
 * Created by lukasz on 2015-11-16.
 */
public class MasterTool {

    private int mMTID;
    private String mMTName;
    private String mMTDescription;
    private int mMTPrice;
    private int mMTWeight;
    private int mMTToolInventoryId;

    public MasterTool(String mMTDescription, int mMTID, String mMTName, int mMTPrice, int mMTWeight, int mMTToolInventoryId) {
        this.mMTDescription = mMTDescription;
        this.mMTID = mMTID;
        this.mMTName = mMTName;
        this.mMTPrice = mMTPrice;
        this.mMTWeight = mMTWeight;
        this.mMTToolInventoryId = mMTToolInventoryId;
    }

    public String getmMTDescription() {
        return mMTDescription;
    }

    public void setmMTDescription(String mMTDescription) {
        this.mMTDescription = mMTDescription;
    }

    public int getmMTID() {
        return mMTID;
    }

    public void setmMTID(int mMTID) {
        this.mMTID = mMTID;
    }

    public String getmMTName() {
        return mMTName;
    }

    public void setmMTName(String mMTName) {
        this.mMTName = mMTName;
    }

    public int getmMTPrice() {
        return mMTPrice;
    }

    public void setmMTPrice(int mMTPrice) {
        this.mMTPrice = mMTPrice;
    }

    public int getmMTWeight() {
        return mMTWeight;
    }

    public void setmMTWeight(int mMTWeight) {
        this.mMTWeight = mMTWeight;
    }
}
