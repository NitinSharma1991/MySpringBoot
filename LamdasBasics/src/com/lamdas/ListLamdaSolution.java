package com.lamdas;

import java.util.*;
import java.util.concurrent.locks.Condition;

public class ListLamdaSolution {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Nitin", "Sharma", "28"),
                new Person("Guddan", "Sharma", "28"),
                new Person("Neeraj", "Sharma", "29"));

          Collections.sort(people,(Person a, Person b)-> a.getFirstName().compareTo(b.getFirstName()));

          printCondtionally(people,p->true);
          printCondtionally(people, p -> p.getFirstName().startsWith("N"));
    }


public static void printCondtionally(List<Person> personList, ListLamda listLamda) {
    for (Person person : personList) {
        if (listLamda.test(person)) {
             System.out.print(person);
    }}
}
}