package com.javacode;
import java.util.*;
 class Person {
    private String firstName;
    private String lastName;

    public class Address {
        private String city;
        private String state;
        private String street;
        private String zip;
        private String phoneNumber;
    }
}
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Collection <String > list = new LinkedList<String>();
        //List list = new ArrayList();
        list.add("Alias");
        list.add("Bean");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = sc.nextLine();
        list.add(firstName);
        System.out.println("Enter Last Name");
        String lastName = sc.nextLine();
        list.add(lastName);
        System.out.println("Name:" +list);
    }
}
