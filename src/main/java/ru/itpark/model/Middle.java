package ru.itpark.model;

import ru.itpark.util.CardMountable;

public class Middle implements CardMountable {
    private String topBlock;
    private String[][] bottomBlock;

    public Middle(String topBlock) {
        this.topBlock = topBlock;
    }

    public Middle(String topBlock, String[][] bottomBlock) {
        this.topBlock = topBlock;
        this.bottomBlock = bottomBlock;
    }

    public String getTopBlock() {
        return topBlock;
    }

    public void setTopBlock(String topBlock) {
        this.topBlock = topBlock;
    }

    public String[][] getBottomBlock() {
        return bottomBlock;
    }

    public void setBottomBlock(String[][] bottomBlock) {
        this.bottomBlock = bottomBlock;
    }

    public String stringBottomBlock(String[][] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                result += array[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }
    @Override
    public String toString() {
        return topBlock + "\n" + stringBottomBlock(bottomBlock) + "\n";
    }
}
