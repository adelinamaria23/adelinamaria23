package org.example.casa;

public class Table {
    public int legs;
    public  String form;
    public boolean myTable;
    public String color;
    public float price;

    public void setLegs(int Legs){
        this.legs = legs;

    }
    public int getLegs(){
        return legs;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setMyTable(boolean myTable){
    this.myTable = myTable;
    }

    public boolean getMyTable() {
     return myTable;
}

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   public float getPrice() {
        return price;
    }

    public float getPriceWithDiscount(){
        return price-10;
    }

    @Override
    public String toString() {
        return "Table{" +
                "legs=" + legs +
                ", form='" + form + '\'' +
                ", myTable=" + myTable +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}



