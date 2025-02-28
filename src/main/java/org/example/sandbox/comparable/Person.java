package org.example.sandbox.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {

        if (this.firstName.compareTo(person.firstName) == 0) {
            if (this.lastName.compareTo(person.lastName) == 0) {
                return this.age - person.age;
            }
            return this.lastName.compareTo(person.lastName);
        }
        return this.firstName.compareTo(person.firstName);

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Person person1 = new Person("John", "Doe", 25);
        Person person2 = new Person("Jane", "Doe", 30);
        Person person3 = new Person("John", "Smith", 35);
        Person person4 = new Person("Jane", "Smith", 40);
        Person person5 = new Person("John", "Doe", 45);

        List<Person> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        people.forEach(System.out::println);
        System.out.println();

        Collections.sort(people);

        people.forEach(System.out::println);
    }
}