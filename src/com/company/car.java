package com.company;

    public class car {
        private String brand;
        private int hp;

        car(String brand, int hp){
            this.brand = brand;
            this.hp = hp;
        }

        public void drive(){
            System.out.println(brand+" "+hp);
        }
}
