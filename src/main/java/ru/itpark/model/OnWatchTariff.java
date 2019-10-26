package ru.itpark.model;

public class OnWatchTariff extends Tariff {
    private int id;
    private String head;
    private CommunicationConditions conditions;
    private int price;
    private boolean about;
    private boolean choose;

    public OnWatchTariff() {
        id = 1;
        head = "On! Watch";
        conditions = new CommunicationConditions(new PhoneCommunication(1200),
                new Internet(), 300);
        price = 750;
        about = true;
        choose = true;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    @Override
    public CommunicationConditions getConditions() {
        return conditions;
    }

    @Override
    public void setConditions(CommunicationConditions conditions) {
        this.conditions = conditions;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean isAbout() {
        return about;
    }

    @Override
    public void setAbout(boolean about) {
        this.about = about;
    }

    @Override
    public boolean isChoose() {
        return choose;
    }

    @Override
    public void setChoose(boolean choose) {
        this.choose = choose;
    }

    @Override
    public String toString() {
        return "OnWatchTariff{" +
                "id=" + id +
                ", head='" + head + '\'' +
                ", conditions=" + conditions +
                ", price=" + price +
                ", about=" + about +
                ", choose=" + choose +
                "} ";
    }
}
