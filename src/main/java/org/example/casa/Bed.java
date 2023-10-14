package org.example.casa;

public class Bed {
    public int legs;
    public boolean myBed;

    public String color;
    public String form;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isMyBed() {
        return myBed;
    }

    public void setMyBed(boolean myBed) {
        this.myBed = myBed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "legs=" + legs +
                ", myBed=" + myBed +
                ", color='" + color + '\'' +
                ", form='" + form + '\'' +
                '}';
    }
}


