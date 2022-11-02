package com.serenitydojo;

import com.serenitydojo.Cat;
import com.serenitydojo.Dog;
import org.junit.Assert;
import org.junit.Test;
import static com.serenitydojo.Cat.usualFood;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenCreatingObjects {

    @Test
    public void CreatingACat(){
      /*  String name = "Felix";
        String favoriteFood = "Tuna";
        int age = 4;*/

        Cat felix = new Cat("Felix", "Tuna", 4);
       /* felix.setFavoriteFood("Tuna");
        felix.setAge(4);*/

        System.out.println(felix.getName());
        System.out.println(felix.getFavoriteFood());
        System.out.println(felix.getAge());


        Cat spot = new Cat("Spot", "Tuna", 3);
       /* spot.setFavoriteFood("Tuna");
        spot.setAge(3);*/

        System.out.println(spot.getName());
        System.out.println(spot.getFavoriteFood());
        System.out.println(spot.getAge());

    }

    @Test
    public void whenCreatingADog(){

        Dog fido = new Dog("Fido","Bone", 5);

        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);

    }

    @Test
    public void cat_makes_noise(){
        Cat felix = new Cat("Felix", 4);

        felix.makeNoise();

        System.out.println("usual food = " + Cat.usualFood());
        felix.groom();

        System.out.println("Felix's favorite food = " + felix.getFavoriteFood());
        System.out.println("Cats like = " + usualFood());

        System.out.println("Felix goes " + felix.makeNoise());;
    }


    @Test
    public void dogCreatesNoise(){
        Dog fido = new Dog("Fido","Bone", 5);

        fido.makeNoise();

        System.out.println(fido.feed());
    }

    @Test
    public void whenCreatingAHamster(){

        Hamster rusty = new Hamster("Rusty","Runner", 6);

        Assert.assertEquals(rusty.getName(), "Rusty");
        Assert.assertEquals(rusty.getFavoriteGame(), "Runner");
        Assert.assertEquals(rusty.getAge(), 6);

    }
    @Test
    public  void dogs_make_noise(){
        Dog fido = new Dog("fido", "bone", 5);
        System.out.println("Fido goes " + fido.makeNoise());
    }

    @Test
    public  void pets_make_noise(){
        Pet felix = new Cat("felix", 4);
        Pet fido = new Dog("Fido", "bone", 5);
        Pet rusty = new Hamster("Rusty", "wheels", 1);

        System.out.println("Felix walks " +felix.goForWalks());

        System.out.println("Felix goes " +felix.makeNoise());
        System.out.println("Fido goes " +fido.makeNoise());
        System.out.println("Rusty goes " +rusty.makeNoise());
    }

    @Test
    public  void when_animals_play(){
        Pet spot = new Cat("Spot", 4);
        Pet fido = new Dog("Fido", "string", 5);
        Pet hazel = new Hamster("Hazel", "runs in wheel", 1);

        assertThat(fido.play(), equalTo("plays with bone"));
        assertThat(spot.play(), equalTo("plays with string"));
        assertThat(hazel.play(), equalTo("runs in wheel"));
    }

}
