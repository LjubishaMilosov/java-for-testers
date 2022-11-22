package com.serenitydojo.lambdas;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PeopleDataBase {

     List<Person> allThePeople;

    public PeopleDataBase(List<Person> allThePeople) {
        this.allThePeople = allThePeople;

    }

    public List<Person> findPeopleUnder35() {
        List<Person> peopleUnder35 = new ArrayList<>();
        for(Person person : allThePeople){
            if(person.getAge() < 35){
                peopleUnder35.add(person);
            }
        }
        return peopleUnder35;
    }

    public List<Person> findPeopleWhoLikeRed() {
        List<Person> peopleWhoLikeRed = new ArrayList<>();
        for(Person person : allThePeople){
            if(person.getFavoriteColor().equals("Red")){
                peopleWhoLikeRed.add(person);
            }
        }return peopleWhoLikeRed;
    }

    public List<Person> findPeopleBetween(int lowestAge, int highestAge) {
        List<Person> matchingPeople = new ArrayList<>();
        for(Person person : allThePeople){
            if(person.getAge() >= lowestAge && person.getAge() <= highestAge){
                matchingPeople.add(person);
            }
        }
        return matchingPeople;
    }

    public List<Person> findAllThePeopleWho(Predicate<Person> check) {

        List<Person> matchingPeople = new ArrayList<>();
        for(Person person : allThePeople){
            if(check.test(person)){
                matchingPeople.add(person);
            }
        }
        return matchingPeople;
    }
}
