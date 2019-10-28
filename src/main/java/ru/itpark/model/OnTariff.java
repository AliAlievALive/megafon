package ru.itpark.model;

public class OnTariff extends Tariff {
    private boolean choose;

    public OnTariff(int id, HeadAndSubhead title, CommunicationConditions conditions, int price, boolean about, boolean choose) {
        super(id, title, conditions, price, about);
        this.choose = choose;
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
        return "OnTariff{" + super.toString() +
                "choose=" + choose +
                "} ";
    }
}
