package com.javacode;
import java.util.*;
class ContactPerson {
    /*private */String firstName;
    /*private*/ String lastName;
    /*private*/ String city;
    /*private*/ String state;
    /*private*/ String street;
    /*private*/ String zip;
    /*private*/ String phoneNumber;

    ContactPerson (String firstName, String lastName, String city, String street, String state, String zip, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.street = street;
        this.zip = zip;
        this.phoneNumber =phoneNumber;

    }

}
public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        ContactPerson contactPerson = new ContactPerson("Tapawinee", "Sethy","Jajpur", "Chandikhole", "Odisha", "755024", "7504573387");
        ArrayList<ContactPerson> arrList = new ArrayList<ContactPerson>();
        arrList.add(contactPerson);
        Iterator<ContactPerson> it = arrList.iterator();
        while(it.hasNext()) {
            ContactPerson contactPerson1 = it.next();
            System.out.println(contactPerson1.firstName+ "\t" +contactPerson1.lastName);
            //System.out.println(contactPerson1.lastName);
            System.out.println(contactPerson1.city);
            System.out.println(contactPerson1.state);
            System.out.println(contactPerson1.street);
            System.out.println(contactPerson1.zip);
            System.out.println(contactPerson1.phoneNumber);
        }

    }
}
