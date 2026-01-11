package main.java.imperative;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Noona", Gender.FEMALE),
                new Person("Sakada", Gender.MALE),
                new Person("Nita", Gender.FEMALE),
                new Person("Borey", Gender.MALE),
                new Person("Bopha", Gender.MALE)
        );
        System.out.println("Imperative Approach");
        //======IMPERATIVE APPROACHES===========
        List<Person> female = new ArrayList<>();
        for (Person person: people) {
            if (Gender.FEMALE.equals(person.gender)) {
                female.add(person);
            }
        }
        for (Person person: female) {
            System.out.println(person);
        }
        System.out.println("Declarative Approach");
        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}