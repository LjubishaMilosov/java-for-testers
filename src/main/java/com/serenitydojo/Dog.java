package com.serenitydojo;

public class Dog extends Pet{



    private String favoriteToy;
    private String favoriteGame = "plays with bone";

    public static final String DOG_NOISE = "LOUD WOOF";
    String isFed;

    public Dog(String name, String favoriteToy, int age) {
        super(name,age);
        this.favoriteToy = favoriteToy;

    }
    @Override
    public String makeNoise(){
       return DOG_NOISE;
    }
    public  String play(){
        return favoriteGame;
    }
    public boolean feed(){
        return true;
    }

  /*  public void setName(String name) {
        this.name = name;
    }*/

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }



}
