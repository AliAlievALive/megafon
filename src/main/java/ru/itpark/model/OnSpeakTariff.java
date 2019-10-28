package ru.itpark.model;

public class OnSpeakTariff extends Tariff {
    private int id;
    private HeadAndSubhead title;
    private CommunicationConditions conditions;
    private int price;
    private boolean about;
    private boolean choose;

    public OnSpeakTariff(int id, HeadAndSubhead title, CommunicationConditions conditions, int price, boolean about, boolean choose) {
        super(id, title, conditions, price, about);
        this.choose = choose;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
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
}
