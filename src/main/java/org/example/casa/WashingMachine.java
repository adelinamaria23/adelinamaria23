package org.example.casa;

public class WashingMachine {
    public String color;
    public String brand;
    public int price;
    public boolean myWashingMachine;
    public int maxRpm;
    public boolean isSlim;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isMyWashingMachine() {
        return myWashingMachine;
    }

    public void setMyWashingMachine(boolean myWashingMachine) {
        this.myWashingMachine = myWashingMachine;
    }

    public int getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(int maxRpm) {
        this.maxRpm = maxRpm;
    }

    public boolean isSlim() {
        return isSlim;
    }

    public void setSlim(boolean slim) {
        isSlim = slim;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", myWashingMachine=" + myWashingMachine +
                ", maxRpm=" + maxRpm +
                ", isSlim=" + isSlim +
                '}';
    }
}
