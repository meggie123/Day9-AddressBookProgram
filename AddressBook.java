package com.bridgelabz.AddressBookSystem;
import java.util.ArrayList;
import java.util.Scanner;
    public class AddressBook {
        public static void main(String[] args) {
            System.out.println("Welcome To Address Book Program");
            OptionMenu operation = new OptionMenu(); // created object of OptionMenu
            operation.operation();
        }
        public static void getInput() {
            DetailsAddressBook details = new DetailsAddressBook();
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the following address details ");
            System.out.println("Enter the First Name :");
            details.setFirstName(input.next());

            System.out.println("Enter the last name:");
            details.setLastName(input.next());

            System.out.println("Enter your email address:");
            details.setEmailAddress(input.next());

            System.out.println("Enter your address:");
            input.nextLine();
            details.setAddress(input.nextLine());

            System.out.println("Enter your city name:");
            details.setCity(input.next());

            System.out.println("Enter your state:");
            details.setState(input.next());

            System.out.println("Enter your pin code:");
            details.setZip(input.nextLong());

            System.out.println("Enter your phone number:");
            details.setPhoneNumber(input.nextLong());
        }
    }

