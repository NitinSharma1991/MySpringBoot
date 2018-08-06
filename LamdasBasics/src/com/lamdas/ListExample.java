package com.lamdas;

import java.util.*;

public class ListExample implements Comparator<Person> {

    public static void main(String[] args){

        List<Person> people = Arrays.asList(new Person("Nitin","Sharma","28"),
                                          new Person("Guddan","Sharma","28"),
                                          new Person("Neeraj","Sharma","29"));

        //Step 1 sort list by first name.
        //Step 2 create a method that prints all elements in the list
        //step 3 create a method that prints all people that first name beginning with N.
          ListExample listExample = new ListExample();
           //     System.out.print("people"+people);
          Collections.sort(people,new ListExample());
          listExample.printList(people);
          listExample.firstNameWithN(people);
     }

    void firstNameWithN(List<Person> personList) {
        ListIterator<Person> personListIterator = personList.listIterator();

        while (personListIterator.hasNext()) {
            Person person = personListIterator.next();
            if (person.getFirstName().startsWith("N")) {
                System.out.print("\n Name: " + person);
            }

        }
    }

    void printList(List<Person> personList){

       ListIterator<Person> personListIterator = personList.listIterator();
       while (personListIterator.hasNext()){
           Person person = personListIterator.next();
           System.out.print(person);
       }
    }

    @Override
    public int compare(Person o1, Person o2) {

               if (o1.getFirstName() == o2.getFirstName()) {
                   return 1;
               }else
                   {
                    return -1;
                }


    }
}

