package ru.itpark.util;

public class Internet {
    private boolean payAfterUse;
    private int trafficLimit;
    private boolean unlimited;

    public Internet() {
        unlimited = true;
    }

    public Internet(boolean payAfterUse) {
        this.payAfterUse = payAfterUse;
    }

    public Internet(int trafficLimit) {
        this.trafficLimit = trafficLimit;
        this.unlimited = false;
    }

    public Internet(boolean payAfterUse, int trafficLimit) {
        this.payAfterUse = payAfterUse;
        this.trafficLimit = trafficLimit;
        this.unlimited = false;
    }

    public boolean isPayAfterUse() {
        return payAfterUse;
    }

    public void setPayAfterUse(boolean payAfterUse) {
        this.payAfterUse = payAfterUse;
    }

    public int getTrafficLimit() {
        return trafficLimit;
    }

    public void setTrafficLimit(int trafficLimit) {
        this.trafficLimit = trafficLimit;
    }

    public boolean isUnlimited() {
        return unlimited;
    }

    public void setUnlimited(boolean unlimited) {
        this.unlimited = unlimited;
    }

    @Override
    public String toString() {
        return "Internet{" +
                "payAfterUse=" + payAfterUse +
                ", trafficLimit=" + trafficLimit +
                ", unlimited=" + unlimited +
                '}';
    }
}
