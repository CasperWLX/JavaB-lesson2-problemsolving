package com.hampus.demo.modules;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping
{
    Scanner input = new Scanner(System.in);

    public void run()
    {
        List<String> listOfItems = new ArrayList<>();
        while(true)
        {
            System.out.println("What would you like to do?");
            System.out.println("1. Add item to list\n2. Remove item from list\n3. Display all items in the list");
            int userChoice = input.nextInt();
            input.nextLine();
            switch(userChoice)
            {
                case 1:
                    addItem(listOfItems);
                    break;
                case 2:
                    removeItem(listOfItems);
                    break;
                case 3:
                    printList(listOfItems);
                    break;
                default:
                    System.out.println("how did u get here?");
            }
        }
    }

    public void addItem(List<String> list)
    {
        System.out.println("Enter item name to add");
        String userChoice = input.nextLine();
        list.add(userChoice);
    }

    public void removeItem(List<String> list)
    {
        System.out.println("Enter the name of the item you would like to remove");
        String userChoice = input.nextLine();

        list.removeIf(item -> item.equals(userChoice));
    }

    public void printList(List<String> list)
    {
        System.out.println(list);
    }
}
