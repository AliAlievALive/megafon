package ru.itpark.model;

import ru.itpark.util.BottomBlockOfMiddle;
import ru.itpark.util.CardMountable;

public class Middle implements CardMountable {
    private String topBlock;
    private BottomBlockOfMiddle bottomBlock;

    public Middle(String topBlock) {
        this.topBlock = topBlock;
    }

    public Middle(String topBlock, BottomBlockOfMiddle bBlock) {
        this.topBlock = topBlock;
        bottomBlock = bBlock;
    }

    public String getTopBlock() {
        return topBlock;
    }

    public void setTopBlock(String topBlock) {
        this.topBlock = topBlock;
    }

    public BottomBlockOfMiddle getBottomBlock() {
        return bottomBlock;
    }

    public void setBottomBlock(BottomBlockOfMiddle bBlock) {
        bottomBlock = bBlock;
    }

    @Override
    public String toString() {
        return topBlock + "\n" + getBottomBlock().toString() + "\n";
    }
}
