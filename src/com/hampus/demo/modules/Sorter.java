package com.hampus.demo.modules;

import java.util.*;

public class Sorter
{
    public void sort()
    {
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(listOfNumbers);
        listOfNumbers.sort(Comparator.reverseOrder());
        System.out.println(listOfNumbers);
    }

    public void printStudents(List<Student> studentList)
    {
        System.out.println(studentList);
    }

    public void swapPlaces(List<Student> studentList)
    {
        Collections.swap(studentList, 0, 1);
    }

    public List<Integer> noNegatives(List<Integer> list)
    {
        list.removeIf(number -> number < 0);

        return list;
    }
}
