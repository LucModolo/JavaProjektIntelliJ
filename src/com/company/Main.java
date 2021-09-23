package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

/*
        int tmp = MathHelper.min(423, 345);

        System.out.println(tmp);

        double tmp2 = MathHelper.min(5.5,6.5);

        System.out.println(tmp2);
*/
        car c1 = new car("BMW",100);
        c1.drive();

        car c2 = new car("Fiat");
        c2.drive();

        car c4 = new car("Fiat", hp: 200, kg: 300);
        c4.drive();


    }
}