package com.AddressBook;
import java.util.Scanner;
public class AddressBook {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book System System.");
        detailBook();
    }
    public static void detailBook()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the book:");
        System.out.println("Enter the name of the address:");
        System.out.println("Enter the name of the City:");
        System.out.println("Enter the name of the State:");
        System.out.println("Enter the name of the Contact Number:");
        System.out.println("Enter the name of the email id:");
        String name = sc.nextLine();
        System.out.println("Name of the book is:"+name);
        String address = sc.nextLine();
        System.out.println("Name of the book is:"+address);
        String city = sc.nextLine();
        System.out.println("Name of the book is:"+city);
        String state = sc.nextLine();
        System.out.println("Name of the book is:"+state);
        int ph_no=sc.nextInt();
        System.out.println("Name of the book is:"+ph_no);
        String email_id = sc.nextLine();
        System.out.println("Name of the book is:"+email_id);

    }
}
