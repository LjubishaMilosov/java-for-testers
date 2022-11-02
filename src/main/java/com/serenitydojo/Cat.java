package com.serenitydojo;

public class Cat extends Pet{

    private String favoriteGame = "plays with string";
    private String favoriteFood;
    private int age;
    public static final String CAT_NOISE = "Meow";

    public static String usualFood(){
        return "Tuna";
    }

    public Cat(String name, int age){
        super(name,age);
        this.favoriteFood = Cat.usualFood();
    }

    public Cat(String name, String favoriteFood, int age) {
        super(name,age);
        this.favoriteFood = favoriteFood;
    }


    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }


    @Override
    public String makeNoise(){
        return CAT_NOISE;
    }

    public  String play(){
        return favoriteGame;
    }

    public void feed(String food) {
        System.out.println(getName() + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }
    private void cleanFur(){
        System.out.println(getName() + " cleans his fur");
    }
    private void lickPaws(){
        System.out.println(getName() + " licks his paws");
    }
}
