package ru.itpark.util;

public class CardMountableTrio {
    private CardMountable top;
    private CardMountable middle;
    private CardMountable bottom;

    public CardMountableTrio(CardMountable top, CardMountable middle, CardMountable bottom) {
        this.top = top;
        this.middle = middle;
        this.bottom = bottom;
    }

    public CardMountable getTop() {
        return top;
    }

    public void setTop(CardMountable top) {
        this.top = top;
    }

    public CardMountable getMiddle() {
        return middle;
    }

    public void setMiddle(CardMountable middle) {
        this.middle = middle;
    }

    public CardMountable getBottom() {
        return bottom;
    }

    public void setBottom(CardMountable bottom) {
        this.bottom = bottom;
    }
}
