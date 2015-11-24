package com.ge.toolstracker.model;

/**
 * Created by lukasz on 2015-11-16.
 */
public class ToolRequest {

    private int mTRRequest;
    private int mTRMasterTool;
    private long mTRStart;
    private long mTREnd;
    private ToolInventory.Status mTRStatus;
    private int mTRToolInventoryId;

    public ToolRequest(long mTREnd, int mTRMasterTool, int mTRRequest, long mTRStart, ToolInventory.Status mTRStatus, int mTRToolInventoryId) {
        this.mTREnd = mTREnd;
        this.mTRMasterTool = mTRMasterTool;
        this.mTRRequest = mTRRequest;
        this.mTRStart = mTRStart;
        this.mTRStatus = mTRStatus;
        this.mTRToolInventoryId = mTRToolInventoryId;
    }

    public long getmTREnd() {
        return mTREnd;
    }

    public void setmTREnd(long mTREnd) {
        this.mTREnd = mTREnd;
    }

    public int getmTRMasterTool() {
        return mTRMasterTool;
    }

    public void setmTRMasterTool(int mTRMasterTool) {
        this.mTRMasterTool = mTRMasterTool;
    }

    public int getmTRRequest() {
        return mTRRequest;
    }

    public void setmTRRequest(int mTRRequest) {
        this.mTRRequest = mTRRequest;
    }

    public long getmTRStart() {
        return mTRStart;
    }

    public void setmTRStart(long mTRStart) {
        this.mTRStart = mTRStart;
    }

    public ToolInventory.Status getmTRStatus() {
        return mTRStatus;
    }

    public void setmTRStatus(ToolInventory.Status mTRStatus) {
        this.mTRStatus = mTRStatus;
    }

    public int getmTRToolInventoryId() {
        return mTRToolInventoryId;
    }

    public void setmTRToolInventoryId(int mTRToolInventoryId) {
        this.mTRToolInventoryId = mTRToolInventoryId;
    }
}
