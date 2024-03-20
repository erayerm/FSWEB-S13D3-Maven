package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;

    String instance1;
    String instance2;
    String instance3;

    public Person(String firstname, String lastName, int age){
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstname, String lastName, int age, String instance1, String instance2, String instance3){
        this(firstname, lastName, age);
        this.instance1 = instance1;
        this.instance2 = instance2;
        this.instance3 = instance3;
    }
    public String getFirstName(){return firstname;}
    public String getLastName(){return lastName;}
    public int getAge(){return age;}
    public boolean isTeen(){return age >= 13 && age <= 19;}
}