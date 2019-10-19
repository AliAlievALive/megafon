package ru.itpark.util;

public class UnlimTo {
    private boolean unlimitedMegafoneCall;
    private boolean unlimitedRussia;

    public UnlimTo(boolean unlimitedMegafoneCall, boolean unlimitedRussia) {
        this.unlimitedMegafoneCall = unlimitedMegafoneCall;
        this.unlimitedRussia = unlimitedRussia;
    }

    public boolean isUnlimitedMegafoneCall() {
        return unlimitedMegafoneCall;
    }

    public void setUnlimitedMegafoneCall(boolean unlimitedMegafoneCall) {
        this.unlimitedMegafoneCall = unlimitedMegafoneCall;
    }

    public boolean isUnlimitedRussia() {
        return unlimitedRussia;
    }

    public void setUnlimitedRussia(boolean unlimitedRussia) {
        this.unlimitedRussia = unlimitedRussia;
    }
}
