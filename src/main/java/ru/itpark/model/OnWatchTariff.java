package ru.itpark.model;

import ru.itpark.util.Internet;
import ru.itpark.util.PhoneCommunication;

public class OnWatchTariff extends Tariff {

    public OnWatchTariff() {
        super(1, new HeadAndSubhead("On! Watch"), new CommunicationConditions(new PhoneCommunication(1200),
                new Internet(), 300), 750, true, true);
    }
}
