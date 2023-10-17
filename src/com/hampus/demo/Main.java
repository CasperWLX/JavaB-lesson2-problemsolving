package com.hampus.demo;

import com.hampus.demo.modules.Shopping;
import com.hampus.demo.modules.Sorter;
import com.hampus.demo.modules.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        //Shopping solution//
        //Shopping shop = new Shopping();
        //shop.run();

        //Sorter solution
        Sorter sorter = new Sorter();
        sorter.sort();

        //Student swap solution
        List<Student> listOfStudents = new ArrayList<>();

        Student benny = new Student("Benny", 23);
        Student frida = new Student("Frida", 40);
        listOfStudents.add(benny);
        listOfStudents.add(frida);

        sorter.printStudents(listOfStudents);
        sorter.swapPlaces(listOfStudents);
        sorter.printStudents(listOfStudents);

        //No negatives solution
        List<Integer> listOfNums = new ArrayList<>(Arrays.asList(-1, -1, -1)); //numbers can be changed to anything
        listOfNums = sorter.noNegatives(listOfNums);
        System.out.println(listOfNums);
    }

}
