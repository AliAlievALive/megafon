package ru.itpark.model;

import ru.itpark.util.Internet;
import ru.itpark.util.PhoneCommunication;

public class CommunicationConditions {
    private PhoneCommunication speaking;
    private Internet internet;
    private int countsSms;
    private String bonuses = "";

    @Override
    public String toString() {
        return "CommunicationConditions{" +
                "speaking=" + speaking +
                ", internet=" + internet +
                ", countsSms=" + countsSms +
                ", bonuses='" + bonuses + '\'' +
                '}';
    }

    public CommunicationConditions(PhoneCommunication speaking) {
        this.speaking = speaking;
    }

    public CommunicationConditions(Internet internet) {
        this.internet = internet;
    }

    public CommunicationConditions(PhoneCommunication speaking, Internet internet) {
        this.speaking = speaking;
        this.internet = internet;
    }

    public CommunicationConditions(PhoneCommunication speaking, Internet internet, int countsSms) {
        this(speaking, internet);
        this.countsSms = countsSms;
    }

    public CommunicationConditions(PhoneCommunication speaking, Internet internet, int countsSms, String bonuses) {
        this(speaking, internet, countsSms);
        this.bonuses = bonuses;
    }

    public PhoneCommunication getSpeaking() {
        return speaking;
    }

    public void setSpeaking(PhoneCommunication speaking) {
        this.speaking = speaking;
    }

    public Internet getInternet() {
        return internet;
    }

    public void setInternet(Internet internet) {
        this.internet = internet;
    }

    public int getCountsSms() {
        return countsSms;
    }

    public void setCountsSms(int countsSms) {
        this.countsSms = countsSms;
    }

    public String getBonuses() {
        return bonuses;
    }

    public void setBonuses(String bonuses) {
        this.bonuses = bonuses;
    }
}
