package ru.itpark.model;

abstract class Tariff {
    private int id;
    private HeadAndSubhead title;
    private CommunicationConditions conditions;
    private int price;
    private boolean choose;
    private boolean about;

    public Tariff(int id, HeadAndSubhead title, CommunicationConditions conditions, int price, boolean about) {
        this.id = id;
        this.title = title;
        this.conditions = conditions;
        this.price = price;
        this.about = about;
    }

    public Tariff() {
    }

    public Tariff(int id, HeadAndSubhead title, CommunicationConditions conditions, int price,
                  boolean about, boolean choose) {
        this.id = id;
        this.title = title;
        this.conditions = conditions;
        this.price = price;
        this.about = about;
        this.choose = choose;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HeadAndSubhead getTitle() {
        return title;
    }

    public void setTitle(HeadAndSubhead title) {
        this.title = title;
    }

    public CommunicationConditions getConditions() {
        return conditions;
    }

    public void setConditions(CommunicationConditions conditions) {
        this.conditions = conditions;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isChoose() {
        return choose;
    }

    public void setChoose(boolean choose) {
        this.choose = choose;
    }

    public boolean isAbout() {
        return about;
    }

    public void setAbout(boolean about) {
        this.about = about;
    }
}
