package ru.itpark.util;

public class Button {
    private String chooseButton;
    private String detailed = "Подробнее";

    public Button(boolean choose) {
        if (choose) {
            chooseButton = "Выбрать";
        } else {
            chooseButton = detailed;
            detailed = "";
        }
    }

    public String getChooseButton() {
        return chooseButton;
    }

    public void setChooseButton(String chooseButton) {
        this.chooseButton = chooseButton;
    }

    public String getDetailed() {
        return detailed;
    }

    public void setDetailed(String detailed) {
        this.detailed = detailed;
    }

    @Override
    public String toString() {
        return chooseButton + "\n" + detailed;
    }
}