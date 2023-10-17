package com.hampus.demo.modules;

public class Student
{
    String name;
    int age;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
