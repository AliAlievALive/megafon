package ru.itpark.util;

public class Trio<E1, E2, E3> {
    private E1 top;
    private E2 middle;
    private E3 bottom;

    public Trio(E1 top, E2 middle, E3 bottom) {
        this.top = top;
        this.middle = middle;
        this.bottom = bottom;
    }

    public E1 getTop() {
        return top;
    }

    public void setTop(E1 top) {
        this.top = top;
    }

    public E2 getMiddle() {
        return middle;
    }

    public void setMiddle(E2 middle) {
        this.middle = middle;
    }

    public E3 getBottom() {
        return bottom;
    }

    public void setBottom(E3 bottom) {
        this.bottom = bottom;
    }
}
