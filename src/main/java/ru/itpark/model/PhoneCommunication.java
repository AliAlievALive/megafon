package ru.itpark.model;

public class PhoneCommunication {
    private int countMin;
    private UnlimTo unlimitedCall;
    private boolean payForSeconds;

    public PhoneCommunication(int countMin) {
        this.countMin = countMin;
    }

    public PhoneCommunication(UnlimTo unlimitedCall) {
        this.unlimitedCall = unlimitedCall;
    }

    public PhoneCommunication(boolean payForSeconds) {
        this.payForSeconds = payForSeconds;
    }

    public PhoneCommunication(UnlimTo unlimitedCall, boolean payForSeconds) {
        this.unlimitedCall = unlimitedCall;
        this.payForSeconds = payForSeconds;
    }

    public PhoneCommunication(int countMin, UnlimTo unlimitedCall) {
        this.countMin = countMin;
        this.unlimitedCall = unlimitedCall;
    }

    public PhoneCommunication(int countMin, boolean payForSeconds) {
        this.countMin = countMin;
        this.payForSeconds = payForSeconds;
    }

    public PhoneCommunication(int countMin, UnlimTo unlimitedCall, boolean payForSeconds) {
        this(countMin, unlimitedCall);
        this.payForSeconds = payForSeconds;
    }

    public UnlimTo getUnlimitedCall() {
        return unlimitedCall;
    }

    public void setUnlimitedCall(UnlimTo unlimitedCall) {
        this.unlimitedCall = unlimitedCall;
    }

    public boolean isPayForSeconds() {
        return payForSeconds;
    }

    public void setPayForSeconds(boolean payForSeconds) {
        this.payForSeconds = payForSeconds;
    }

    public int getCountMin() {
        return countMin;
    }

    public void setCountMin(int countMin) {
        this.countMin = countMin;
    }

    @Override
    public String toString() {
        return "PhoneCommunication{" +
                "countMin=" + countMin +
                ", unlimitedCall=" + unlimitedCall +
                ", payForSeconds=" + payForSeconds +
                '}';
    }
}
