package com.serenitydojo;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;


public class WhenWorkingWithJavaLists {

    @Test
    public void creatingASimpleList(){

        List simpleList = new ArrayList();

        simpleList.add("a string value");
        simpleList.add(123);

        assertThat(simpleList).contains("a string value", 123);

    }

    @Test
    public void createTypedList(){

        List<String> names = Arrays.asList("joe","sally","pete");
        List<Integer> ages = Arrays.asList(10,30,50);

       /* names.add("joe");
        names.add("sally");
        names.add("pete");*/

        assertThat(names).contains("joe","sally","pete");
        assertThat(ages).contains(10,30,50);
    }

    @Test
    public void removingStuff(){

        List<String> names = new ArrayList<>();
        names.add("joe");
        names.add("sally");
        names.add("pete");

        names.remove("sally");

        assertThat(names).contains("joe","pete");

        names.clear();
        assertThat(names).isEmpty();
    }

    @Test
    public void immutableLists(){

        List<String> names = Arrays.asList("joe","sally","pete");
        List<Integer> ages = Arrays.asList(10,30,50);
        /**
         * we cannot add or remove elements from immutable lists
         */
        //names.remove("sally");
        //names.add("paul");

        assertThat(names).contains("joe","pete");
    }

    @Test
    public void findElementsInAList(){

        List<String> names = Arrays.asList("joe","sally","pete","sally","paul");

        int indexOfSally = names.indexOf("sally");
        int lastIndexOfSally = names.lastIndexOf("sally");

        assertThat(indexOfSally).isEqualTo(1);
        assertThat(lastIndexOfSally).isEqualTo(3);
    }

    @Test
    public void findingASubList(){

        List<String> names = Arrays.asList("joe","sally","pete","sally","paul");

        List<String> middleNames = names.subList(1,4);

        assertThat(names).contains("sally","pete","sally");

    }
    @Test
    public void findingTheSize(){

        List<String> names = Arrays.asList("joe","sally","pete","sally","paul");

        assertThat(names.size()).isEqualTo(5);

    }

    @Test
    public void convertingAListToASet(){

        /** in Sets there is no order of elements
         * HashSet is the most commonly used Set
         * values do not repeat themselves in a set
         */

        List<String> names = Arrays.asList("joe","sally","pete","sally","paul");

        Set<String> uniqueNames = new HashSet<>(names);

        assertThat(uniqueNames).containsExactlyInAnyOrder("joe","sally","pete","paul");
    }
    @Test
    public void sortingAList(){

        List<String> names = Arrays.asList("joe","sally","pete","sally","paul");

        Collections.sort(names);

        assertThat(names).containsExactly("joe","paul","pete","sally","sally");
    }

    @Test
    public void findingMaxAndMin(){

        List<Integer> ages = Arrays.asList(10,30,50,20,15);

        assertThat(Collections.max(ages)).isEqualTo(50);
        assertThat(Collections.min(ages)).isEqualTo(10);
    }

    @Test
    public void combiningLists(){

        List<String> names = new ArrayList<>();
        names.add("joe");
        names.add("sally");
        names.add("pete");

        List<String> moreNames = new ArrayList<>();
        names.add("paul");
        names.add("petra");

        names.addAll(moreNames);
        assertThat(names).contains("joe","sally","pete","paul","petra");

        names.removeAll(names);
        assertThat(names).isEmpty();
    }
}
