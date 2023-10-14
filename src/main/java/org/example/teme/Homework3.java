package org.example.teme;

public class Homework3 {
    //Fields
    public int field1 = 0;
    public double filed2;
    public long field3;
    public float field4;
    public char field5;
    public short field6;
    public byte field7;
    public boolean field8;
    public String field9;

    //Methods
    public void runHomework() {
        System.out.println(field1);
        field1++;
        System.out.println(field1);
        field1--;
        System.out.println(field1);
        ++field1;
        System.out.println(field1);
        --field1;
        System.out.println(field1);
        field1 = field1 + 2;
        System.out.println(field1);
        field1 += 2;
        System.out.println(field1);
        field1 -= 2;
        System.out.println(field1);
        field1 -= 5;
        System.out.println(field1);
        field1 *= 2;
        System.out.println(field1);
        field1 /= 2;
        System.out.println(field1);
        field1 %= 2;
        System.out.println(field1);

        if (field1 == -1) {
            System.out.println("abc");
        }
        if (field1 != -2) {
            System.out.println("bca");
        }



    }
}
