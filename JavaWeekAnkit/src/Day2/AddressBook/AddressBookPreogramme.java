package Day2.AddressBook;

import java.io.*;
import java.util.Scanner;

/**
 * Created by student on 04-May-16.
 */
public class AddressBookPreogramme {

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        try {
            addressBook.loadContactFromFile(new File("ContactDetails.txt"));
            System.out.println("We Boom it");
        } catch (Exception e) {
            System.out.println("Failed Man !! Not Boom");
        }


        addressBook.sortByLastName();

        addressBook.PrintAllContacts();

        System.out.println(addressBook.searchContactByLastName("Kennedy"));
    }
}

