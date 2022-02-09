package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person person = new Person("Aibek", "Vrach");
        System.out.println("\nPerson {" + person  + '}');
        person.learn();
        person.walk();
        person.eat();
        person.toString();
        System.out.println("**************************************************************************************");

        Programmer programmer = new Programmer("Kuba", "Backend designer", "Peaksoft");
        System.out.println(programmer);
        programmer.toString();
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();


        Dancer dancer = new Dancer("Aidai", "Balerina", "Happybabies");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        dancer.toString();

        Singer singer = new Singer("Mirbek Atabekov", "Singer", "Noname");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();

    }
}
