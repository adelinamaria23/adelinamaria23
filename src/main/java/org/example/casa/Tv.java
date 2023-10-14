package org.example.casa;

public class Tv {
    public boolean isSmart;
    public String color;
    public String band;
    public float size;
    public  float refreshRate;

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getRefreshrate() {
        return refreshRate;
    }

    public void setRefreshrate(float refreshrate) {
        this.refreshRate = refreshrate;
    }
}
