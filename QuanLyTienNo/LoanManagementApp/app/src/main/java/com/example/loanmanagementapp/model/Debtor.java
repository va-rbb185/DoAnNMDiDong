package com.example.loanmanagementapp.model;

public class Debtor {
    private int mID;
    private String mName;
    private String mPhone;
    private String mAddress;
    private int mDebt;
    private double mInterest_rate;
    private String mDate;
    private double mInterest;

    public Debtor() {
    }

    public Debtor(int mID, String mName, String mPhone, String mAddress, int mDebt, double mInterest_rate, String mDate, double mInterest) {
        this.mID = mID;
        this.mName = mName;
        this.mPhone = mPhone;
        this.mAddress = mAddress;
        this.mDebt = mDebt;
        this.mInterest_rate = mInterest_rate;
        this.mDate = mDate;
        this.mInterest = mInterest;
    }

    public Debtor(String mName, String mPhone, String mAddress, int mDebt, double mInterest_rate, String mDate, double mInterest) {
        this.mName = mName;
        this.mPhone = mPhone;
        this.mAddress = mAddress;
        this.mDebt = mDebt;
        this.mInterest_rate = mInterest_rate;
        this.mDate = mDate;
        this.mInterest = mInterest;
    }

    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID = mID;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public int getmDebt() {
        return mDebt;
    }

    public void setmDebt(int mDebt) {
        this.mDebt = mDebt;
    }

    public double getmInterest_rate() {
        return mInterest_rate;
    }

    public void setmInterest_rate(double mInterest_rate) {
        this.mInterest_rate = mInterest_rate;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public double getmInterest() {
        return mInterest;
    }

    public void setmInterest(double mInterest) {
        this.mInterest = mInterest;
    }
}