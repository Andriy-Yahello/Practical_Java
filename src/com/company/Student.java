package com.company;

/**
 * Created by Lofongi on 05.06.2017.
 */
public class Student extends  Person {
    int course = 1;

    public Student(String n, int a, int course){
        super(n, a);
        this.course = course;
    }

    void tell(){
        System.out.println(super.name);
    }
}
