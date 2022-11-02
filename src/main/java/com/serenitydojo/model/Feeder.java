package com.serenitydojo.model;

import static com.serenitydojo.model.FoodType.*;

public class Feeder {


    /*public String feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")) {

         *//**   if(isPremium){
                return "Salmon";
            } else
            return "Tuna";*//*
            return (isPremium == true) ? "Salmon" : "Tuna";
        } else if(animal.equals("Dog")){
            if(isPremium) {
                return "DeluxeDogFood";
            } else
                return "Dog Food";
            //  return(isPremium == true) ? "DeluxeDogFood" : "Dog Food";
        }
        *//*else if(isPremium){
            return "Lettuce";
        }
        else {
            return "Cabbage";*//*
        else {
            return (isPremium == true) ? "Lettuce" : "Cabbage";
        }

    }*/

    public FoodType feeds(AnimalType animal, boolean isPremium) {



        switch(animal){
            case CAT:
                return  (isPremium == true) ? SALMON : TUNA;

            case DOG:
                return  (isPremium == true) ? DELUXE_DOG_FOOD : DOG_FOOD;

            case HAMSTER:
                return (isPremium == true) ? LETTUCE : CABBAGE;

            default:
                return  UNKNOWN;

        }

    }



}
