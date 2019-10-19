package ru.itpark.model;

public class HeadAndSubhead {
    private String name;
    private String subHead = "";
    private String hit = "";

    public HeadAndSubhead(String name) {
        this.name = name;
    }

    public HeadAndSubhead(String name, String subHead) {
        this.name = name;
        this.subHead = subHead;
    }

    public HeadAndSubhead(String name, String subHead, String hit) {
        this.name = name;
        this.subHead = subHead;
        this.hit = hit;
    }

    public String getHit() {
        return hit;
    }

    public void setHit(String hit) {
        this.hit = hit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubHead() {
        return subHead;
    }

    public void setSubHead(String subHead) {
        this.subHead = subHead;
    }
}
