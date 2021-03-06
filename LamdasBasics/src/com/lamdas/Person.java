package com.lamdas;

public class Person {
    private String firstName, lastName, age;

    public Person (String firstName,String lastName,String age){
        super();
        this.firstName = firstName;
        this.lastName =lastName;
        this.age=age;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
     return "firstName"+":"+firstName+", "+"\nlastName"+":"+lastName+" ,"+"\nage"+":"+age+  "\n";
    }
}
