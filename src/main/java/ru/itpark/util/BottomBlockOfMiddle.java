package ru.itpark.util;

import java.util.Arrays;

public class BottomBlockOfMiddle {
    private String[][] bBlock;

    public BottomBlockOfMiddle(String[][] bBlock) {
        this.bBlock = Arrays.copyOf(bBlock, bBlock.length);
    }

    public String[][] getbBlock() {
        return Arrays.copyOf(bBlock, bBlock.length);
    }

    public void setbBlock(String[][] bBlock) {
        this.bBlock = Arrays.copyOf(bBlock, bBlock.length);
    }

    @Override
    public String toString() {
        return Arrays.toString(bBlock);
    }
}
