package org.example.teme;

import org.example.casa.*;

public class Tema1 {
    public static void tema1() {
        Chair chair1 = new Chair();
        chair1.setLegs(3);
        chair1.setColor("red");
        chair1.setMyChair(true);
        chair1.setBackrest(true);
        System.out.println(chair1);

        Table table1 = new Table();
        table1.setMyTable(true);
        table1.setForm("square");
        table1.setColor("blue");
        table1.setPrice(100);
        table1.setLegs(4);
        System.out.println(table1.getPriceWithDiscount());
        System.out.println(table1);

        Bed bed1 = new Bed();
        bed1.setColor("red");
        bed1.setForm("square");
        bed1.setLegs(4);
        bed1.setMyBed(true);

        WashingMachine washingMachine1 = new WashingMachine();
        washingMachine1.setBrand("samsung");
        washingMachine1.setMaxRpm(320);
        washingMachine1.setColor("black");
        washingMachine1.setSlim(true);
        washingMachine1.setMyWashingMachine(true);

        Wardrobe wardrobe1 = new Wardrobe();

        System.out.println(bed1 + " \n" + washingMachine1);

        Lamp lamp1 = new Lamp();
        lamp1.setMyLamp(true);
        lamp1.setBulbsNumber(2);
        lamp1.setColor("red");
        lamp1.setHeight(2);
        System.out.println(bed1 + "\n" + washingMachine1 + "\n" + lamp1 + "\n" + chair1);

    }
}
