package org.example.casa;

public class Chair {

    public int legs;
    public boolean backrest;
    private boolean myChair;
    private String color;

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setBackrest(boolean backrest) {
        this.backrest = backrest;
    }

    public boolean getBackrest() {
        return backrest;
    }

    public void setMyChair(boolean myChair) {
        this.myChair = myChair;
    }

    public boolean getMyChair() {
        return myChair;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "legs=" + legs +
                ", backrest=" + backrest +
                ", myChair=" + myChair +
                ", color='" + color + '\'' +
                '}';
    }
}