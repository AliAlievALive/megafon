package ru.itpark.model;

public class OnWatch extends Tariff {
    public OnWatch(int id, HeadAndSubhead title, CommunicationConditions conditions, int price,
                   boolean about, boolean choose) {
        super(id, title, conditions, price, about, choose);
    }

    @Override
    public String toString() {
        return "OnWatch{" +
                "id=" + id +
                ", title=" + title +
                ", conditions=" + conditions +
                ", price=" + price +
                ", choose=" + choose +
                ", about=" + about +
                '}';
    }
}
