package ru.itpark.model;

import ru.itpark.util.CardMountable;

public class Top implements CardMountable {
    private String heading;
    private boolean addHit;
    private String hit = "";
    private String subhead = "";

    public Top() {
    }

    public Top(String heading) {
        this.heading = heading;
    }

    public Top(String heading, String subhead) {
        this.heading = heading;
        this.subhead = "\n" + subhead + "\n";
    }

    public Top(String heading, boolean hit, String subhead) {
        this.heading = heading;
        this.hit = hit ? "     Хит + \n" : "+ \n";
        this.subhead = "\n" + subhead + "\n";
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public boolean isAddHit() {
        return addHit;
    }

    public void setAddHit(boolean addHit) {
        this.addHit = addHit;
    }

    public String getHit() {
        return hit;
    }

    public void setHit(String hit) {
        this.hit = hit;
    }

    public String getSubhead() {
        return subhead;
    }

    public void setSubhead(String subhead) {
        this.subhead = subhead;
    }

    @Override
    public String toString() {
        return heading + hit + subhead + "\n";
    }
}
