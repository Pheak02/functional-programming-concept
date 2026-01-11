package main.java.imperative;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Noona", Gender.FEMALE),
                new Person("Sakada", Gender.MALE),
                new Person("Nita", Gender.FEMALE),
                new Person("Borey", Gender.MALE),
                new Person("Bopha", Gender.MALE)
        );

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