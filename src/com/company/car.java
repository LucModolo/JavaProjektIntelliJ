package com.company;

    public class car {
        private String brand;
        private int hp;
        private double wigth;

        car(String brand, int hp){
            this.brand = brand;
            this.hp = hp;
        }

        car(String brand){
            this.brand = brand;
        }
         car(String brand,int hp,double wigth){
            this.brand = brand;
            this.hp = hp;
            this.wigth = wigth;
         }


        public void drive(){
            if (wigth == 2600) {
                System.out.println("Der "+brand+" hat "+hp+" PS und wiegt  "+ wigth+ " kg");
            }
            if (hp != 0){
                System.out.println("Der "+brand);
            }
            else if (wigth != 0){
                System.out.println("Der "+brand+" hat "+hp+" PS");
            }
            System.out.println("Der "+brand+" hat "+hp+" und hat ein Gewicht von "+wigth);
        }
}
