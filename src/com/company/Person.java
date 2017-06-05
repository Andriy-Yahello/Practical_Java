package com.company;

public class Person {
    public int height = 178;
    public String name = "Some name";
    public void say(String name){
        System.out.println("your name is: " + name);
    }

    public Person(){

    }

    public Person(String n){
        name = n;
    }

    public Person(String n, int a){
        height = a;
        name = n;
    }

}
