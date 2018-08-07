package com.lamdas;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ListLamdaSolution {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Nitin", "Sharma", "28"),
                new Person("Guddan", "Sharma", "28"),
                new Person("Neeraj", "Sharma", "29"));

          Collections.sort(people,(Person a, Person b)-> a.getFirstName().compareTo(b.getFirstName()));

          printConditionally(people,p->true);
          printConditionally(people, p -> p.getFirstName().startsWith("N"));
    }


public static void printConditionally(List<Person> personList, Predicate<Person> predicate) {
    for (Person person : personList) {
        if (predicate.test(person)) {
             System.out.print(person);
    }}
}
}