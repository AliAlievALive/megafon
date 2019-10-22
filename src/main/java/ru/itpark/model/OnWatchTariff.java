package ru.itpark.model;

import ru.itpark.util.Internet;
import ru.itpark.util.PhoneCommunication;

public class OnWatchTariff extends Tariff {
    private PhoneCommunication phoneCommunication = new PhoneCommunication(1200);
    private Internet internet = new Internet();
    private int countsSms = 300;
    private HeadAndSubhead head = new HeadAndSubhead("On! Watch");
    private CommunicationConditions conditions = new CommunicationConditions(phoneCommunication, internet, countsSms);
    private boolean choose = true;
    private boolean about = true;

    public OnWatchTariff(){
        super();
    }

    @Override
    public String toString() {
        return "OnWatchTariff{" +
                "id=" + id +
                ", title=" + title +
                ", conditions=" + conditions +
                ", price=" + price +
                ", choose=" + choose +
                ", about=" + about +
                '}';
    }
}
