package com.serenitydojo.datatypes;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WhenWorkingWithMaps {

    @Test
    public void creatingAMAp(){
        Map<String, Integer> numberOfBallsByColor = new HashMap<>();

        numberOfBallsByColor.put("red", 3);
        numberOfBallsByColor.put("green", 6);
        numberOfBallsByColor.put("blue", 5);

        Integer numberOfBalls = numberOfBallsByColor.get("red");
        System.out.println(numberOfBalls);
    }

    @Test
    public void creatingAMApConcisely(){

        Map<String, Integer> numberOfBallsByColor = Map.of("red", 3, "green", 6, "blue", 5);

        Map<String, Integer> moreColors = new HashMap<>();

        moreColors.put("yellow", 10);
        moreColors.put("mauve", 0);
        moreColors.putAll(numberOfBallsByColor);
        System.out.println(moreColors.get("yellow"));


        System.out.println("Number of colors for white balls: " + moreColors.get("white"));

        System.out.println("Number of colors for white balls: " + moreColors.getOrDefault("white", 0));

        System.out.println("Purple tennis balls are present: " + moreColors.containsKey("purple"));

        System.out.println("Blue tennis balls are present: " + moreColors.containsKey("blue"));

        System.out.println("Zero mauve tennis balls are present: " + moreColors.containsValue(0));

        moreColors.put("yellow", 20);
        moreColors.put("pink", 15);

        moreColors.replace("pink", 10);

        System.out.println("Number of yellow tennis balls " + moreColors.getOrDefault("yellow", 0));
        System.out.println("Number of pink tennis balls " + moreColors.getOrDefault("pink", 0));
    }

    @Test
    public void iteratingOverMapKeys(){

        Map<String, Integer> numberOfBallsByColor = Map.of("red", 3, "green", 6, "blue", 5);

        System.out.println("Keys: " + numberOfBallsByColor.keySet());
        System.out.println("Values: " + numberOfBallsByColor.values());

        for(String key : numberOfBallsByColor.keySet()){
            Integer numberOfTennisBalls = numberOfBallsByColor.get(key);
            System.out.println(key + "=>" + numberOfTennisBalls);
        }

        for(Map.Entry<String, Integer> entry : numberOfBallsByColor.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

    @Test
    public void removingThingsFromAMap(){

        Map<String, Integer> numberOfBallsByColor = Map.of("red", 3, "green", 6, "blue", 5);

        Map<String, Integer> modifiableMap = new HashMap<>();
        modifiableMap.putAll(numberOfBallsByColor);

        modifiableMap.remove("red");

        printMap(modifiableMap);

        System.out.println("Keys: " + modifiableMap.keySet());
        System.out.println("Keys: " + modifiableMap.values());

    }


    private void printMap(Map<String, Integer> numberOfBallsByColor) {
        for(Map.Entry<String, Integer> entry : numberOfBallsByColor.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
