package com.company;

    public class car {
        private String brand;
        private int hp,kg;

        car(String brand, int hp){
            this.brand = brand;
            this.hp = hp;
        }

        car(String brand, int hp, int kg){
            this.brand = brand;
            this.hp = hp;
            this.kg = kg;
        }

        public void drive(){
            System.out.println("Ein "+brand+" fährt mit "+hp+"PS und hat "+kg+" gewicht");
        }
}
