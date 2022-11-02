package com.serenitydojo;

public class Hamster extends Pet{

    private String favoriteGame = "runs in wheel";
    private int age;
    private String hamsterNoise = "Squeak";


    public Hamster(String name, String favoriteGame, int age) {
        super(name,age);
        this.favoriteGame = favoriteGame;
        this.age = age;
    }

    public String getFavoriteGame(){
        return favoriteGame;
    }
    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String makeNoise(){
        return hamsterNoise;
    }

    public  String play(){
        return favoriteGame;
    }


}
