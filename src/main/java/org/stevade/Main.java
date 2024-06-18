package org.stevade;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person("Chidinma", "Muoghalu", 16);
        person.setFirstName("Dele");
        person.setLastName("George");
        System.out.println(person.getFirstName());

        Female blessing = new Female("Blessing", "Oni", 28, "All back", "40");
        System.out.println(blessing);
        Male ife = new Male("Ife", "joy", 60, "trble", "fresh", "wide");
        System.out.println(ife);
        ife.walk();
        blessing.walk();
    }
    //Solid principles
    //OOP Concepts
    //Encapsulation
    //Inheritance 1.extends for inheriting a (Class) 2. implements for inheriting an (Interface)
    //Polymorphism: Method overloading and overriding explains this.
    //Abstraction
    //Classes

    //Method overloading and overriding


    //Build tools
    //Maven and Gradle
    //maven uses pom.xml file to import dependencies
    //Java packaging 1. Jar 2. War




}