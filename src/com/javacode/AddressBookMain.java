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
        LinkedList<String > list = new LinkedList<String>();
        int n;
        //List list = new ArrayList();
        list.add("Alias");
        list.add("Bean");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to Add Names");
        n = sc.nextInt();
        String firstName = sc.nextLine();
        System.out.println("Enter  Person Names");
        for (int i=0; i <= n; i++) {
            firstName = sc.nextLine();
            list.add(firstName);
        }
        list.add(firstName);
        System.out.println("Edit Names :" );
        String newName1 = sc.nextLine();
        String newName2 = sc.nextLine();
        list.set(2, newName1);
        list.set(3, newName2);
        System.out.println("Name: " +list);
        System.out.println("Delete Location:" );
        int var = sc.nextInt();
        list.remove(var);
        System.out.println("Name: " +list);
    }
}
