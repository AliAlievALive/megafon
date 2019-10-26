package ru.itpark.model;

public class OnWatchTariff extends Tariff {
    private int id = 1;
    private String head = "On! Watch";


    public OnWatchTariff(int id, String head,) {
        super(id, new HeadAndSubhead("On! Watch"), new CommunicationConditions(new PhoneCommunication(1200),
                new Internet(), 300), 750, true, true);
    }
}
