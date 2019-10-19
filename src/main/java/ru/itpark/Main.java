package ru.itpark;

import ru.itpark.model.CommunicationConditions;
import ru.itpark.model.HeadAndSubhead;
import ru.itpark.model.OnWatch;
import ru.itpark.util.Internet;
import ru.itpark.util.PhoneCommunication;

public class Main {
    public static void main(String[] args) {
        PhoneCommunication phoneCommunication = new PhoneCommunication(1200);
        Internet internet = new Internet();
        int countsSms = 300;
        HeadAndSubhead head = new HeadAndSubhead("On! Watch");
        var communicationOnWatch = new CommunicationConditions(phoneCommunication, internet, countsSms);
        System.out.println(new OnWatch(1, head, communicationOnWatch, 650, true, true));
    }
}
