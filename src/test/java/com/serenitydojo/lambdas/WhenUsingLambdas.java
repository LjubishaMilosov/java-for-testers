package com.serenitydojo.lambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WhenUsingLambdas {

    @Test
    public void printingOutColors() {

        List<String> colors = Arrays.asList("red", "green", "blue");

        colors.forEach(color -> printColorOf(color));

      /*  for (String color : colors) {
           printColorOf(color);
        }*/
    }
    public void printColorOf(String color){
        System.out.println("COLOR = " + color);
    }

    @Test
    public void printingOutColorsWithCodeLogic() {

        List<String> colors = Arrays.asList("red", "green", "blue");

        colors.forEach(color -> {
            if(color.equals("red"))
                System.out.println("RED!");
            else
                System.out.println(color);
        });

      /*  for (String color : colors) {
           printColorOf(color);
        }*/
    }
    @Test
    public void filteringColors() {

        List<String> colors = Arrays.asList("red", "green", "blue", "gray");

        colors.stream().
                filter(color -> color.startsWith("g"))
                .forEach(color -> System.out.println(color));


    }
    @Test
    public void filterColorsAndCollectToList() {

        List<String> colors = Arrays.asList("red", "green", "blue", "gray","gray-blue", "gritty white");

        List<String> filteredColors =
        colors.stream().
                filter(color -> color.startsWith("g"))
                .collect(Collectors.toList());Collectors.toList();

        System.out.println(filteredColors);

    }

    @Test
    public void filterColorsSortAndCollectToList() {

        List<String> colors = Arrays.asList("red", "green", "blue", "gray","gray-blue", "gritty white");

        List<String> filteredColors =
                colors.stream().
                        filter(color -> color.startsWith("g"))
                        .sorted()
                        .collect(Collectors.toList());Collectors.toList();

        System.out.println(filteredColors);

    }

    @Test
    public void convertWebElementsToString() {

        List<String> colors = Arrays.asList("red", "green", "blue", "gray","gray-blue", "gritty white");

        List<String> filteredColors =
                colors.stream().
                        filter(color -> color.startsWith("g")).
                        map(color -> color.toUpperCase()).
                        sorted().
                        collect(Collectors.toList());Collectors.toList();

        System.out.println(filteredColors);

    }

}

