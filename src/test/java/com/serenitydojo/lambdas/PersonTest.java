package com.serenitydojo.lambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.serenitydojo.lambdas.Person.Gender.FEMALE;
import static com.serenitydojo.lambdas.Person.Gender.MALE;
import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    Person sam = new Person("Sam", FEMALE, 30, "Green");
    Person bill = new Person("Bill", MALE, 40, "Blue");
    Person tim = new Person("Tim", MALE, 10, "Red");
    Person susan = new Person("Susan", FEMALE, 50, "Red");
    Person sarah = new Person("Sarah", FEMALE, 50, "Orange");
    Person paul = new Person("Paul", MALE, 40, "Cyan");

    List<Person> allThePeople = Arrays.asList(sam, bill, tim, susan, sarah, paul);

    Predicate<Person> LIKE_BLUE = person -> person.getFavoriteColor().equals("Blue");
    Predicate<Person> LIKE_GREEN = person -> (person.getFavoriteColor().equals("Green"));
    Predicate<Person> LIKE_RED_OR_UNDER_30 = person -> person.getFavoriteColor().equals("Red") || person.getAge() <= 30;
    Predicate<Person> LIKE_RED = person -> person.getFavoriteColor().equals("Red");

    @Test
    public void ICanCreateSomePeople() {

        List<Person> people = Arrays.asList(sam, bill, tim);
        System.out.println(people);
    }

    @Test
    public void canSearchPeopleByAge() {

        PeopleDataBase people = new PeopleDataBase(allThePeople);
        List<Person> peopleUnder35 = people.findPeopleUnder35();   //????
        assertThat(peopleUnder35).contains(sam, tim);

    }

    @Test
    public void canSearchPeopleBetween20And40() {

        PeopleDataBase people = new PeopleDataBase(allThePeople);
        List<Person> peopleBetween20And40 = people.findPeopleBetween(20, 40);   //????
        assertThat(peopleBetween20And40).contains(sam, bill);

    }

    @Test
    public void canSearchPeopleWhoLikeRed() {

        PeopleDataBase people = new PeopleDataBase(allThePeople);
        List<Person> matchingPeople = people.findAllThePeopleWho(LIKE_RED);   //????
        assertThat(matchingPeople).contains(tim, susan);

    }

    @Test
    public void canSearchPeopleWhoLikeBlue() {

        PeopleDataBase people = new PeopleDataBase(allThePeople);
        /*PersonChecker likeBlue = new PersonChecker() {
            @Override
            public boolean test(Person person) {
                return person.getFavoriteColor().equals("Blue");
            }
        };*/
        //PersonChecker likeBlue = person -> person.getFavoriteColor().equals("Blue");

        List<Person> matchingPeople = people.findAllThePeopleWho(LIKE_BLUE);   //????
        assertThat(matchingPeople).contains(bill);

    }

    @Test
    public void canSearchForPeopleWhoLikeRedOrWhoAre30OrUnder() {

        PeopleDataBase people = new PeopleDataBase(allThePeople);
        List<Person> matchingPeople = people.findAllThePeopleWho(LIKE_RED_OR_UNDER_30);  ///?????????
        assertThat(matchingPeople).contains(sam, tim, susan);
    }

    @Test
    public void canSearchForPeopleWhoLikeGreen() {

        PeopleDataBase people = new PeopleDataBase(allThePeople);
        List<Person> matchingPeople = people.findAllThePeopleWho(LIKE_GREEN);  ///?????????
        assertThat(matchingPeople).contains(sam);
    }

    @Test
    public void peopleCanEarnPoints(){
        allThePeople.parallelStream().forEach(
                person -> person.earnPoints(100)
        );

        allThePeople.forEach(
                person -> System.out.println("POINTS FOR " + person.getName() + " = " + person.getPoints()
        ));
    }

    @Test
    public void getAllTheColors(){

        List<String> allTheColors = allThePeople.stream().map(person -> person.getFavoriteColor()).
                collect(Collectors.toList());

        System.out.println(allTheColors);
    }

}






