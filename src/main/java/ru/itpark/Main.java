package ru.itpark;

import ru.itpark.model.*;

public class Main {
    public static void main(String[] args) {
        HeadAndSubhead head = new HeadAndSubhead("Включайся!\n" + "Смотри");
        PhoneCommunication phoneCommunication1 = new PhoneCommunication(120);
        Internet internet1 = new Internet();
        CommunicationConditions communication1 = new CommunicationConditions(phoneCommunication1, internet1, 300,
                "http://... " + "Кино и сериалы в Мегафон...\n" + "http://... " + "Кэшбэк...");
        System.out.println(communication1);
        OnTariff watch = new OnTariff(1, head, communication1, 650, true, true);
        System.out.println(watch);
    }
}