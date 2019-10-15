package ru.itpark.model;

import ru.itpark.util.Button;
import ru.itpark.util.CardMountable;

public class Bottom implements CardMountable {
    private String price;
    private Button button;

    public Bottom(String price, Button button) {
        this.price = price;
        this.button = button;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    @Override
    public String toString() {
        return price + button;
    }
}
