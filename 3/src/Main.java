/**
 * This is the main method which makes use of the add-delete-find-display methods.
 * @author Mohammad-Yarahmadi 40231059
 * @version 1.0
 * @since 2023-03-30
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Address p1a = new Address("12345", "iran", "borujerd");
        Address p2a = new Address("67890", "iran", "KhoramAbad");
        System.out.println(p1a.toString());
        System.out.println(p2a.toString());
        PhoneNumber p1p = new PhoneNumber("+98", "9169653744");
        PhoneNumber p2p = new PhoneNumber("+98", "9908415055");
        Contact p1c = new Contact("ce402", "yarahmadi0077@gmail.com", "Mohammad",
                "Yarahmadi", p1p, p1a);
        Contact p2c = new Contact("ce402", "Mousivand@gmail.com", "Hamed",
                "Mousivand", p2p, p2a);
        p1c.printContacts();
        p2c.printContacts();
        PhoneBook test = new PhoneBook();
        System.out.println();
        System.out.println(test.addContact(p1c));
        System.out.println(test.addContact(p2c));

        System.out.println("According to the guide\n" +
                "Enter the appropriate key");
        int n = 0 ;
        while (n != 7) {
            int j = 0 ;
            System.out.println("1-Add a Contact   2-Delete a Contact    3-Find a Contact    4-Find a Group    5-Show Contacts   6-Exit");
            n = input.nextInt();
            if (n == 6)
                System.exit(0);
            else if (n == 1) {
                System.out.println("enter the Zip code:");
                String s1 = input.next();
                System.out.println("enter the Country:");
                String s2 = input.next();
                System.out.println("enter the City:");
                String s3 = input.next();
                System.out.println("enter the Country code:");
                String s4 = input.next();
                System.out.println("enter the Phone number:");
                String s5 = input.next();
                System.out.println("enter the Group name:");
                String s6 = input.next();
                System.out.println("enter the Email Address:");
                String s7 = input.next();
                System.out.println("enter the First name");
                String s8 = input.next();
                System.out.println("enter the Last name");
                String s9 = input.next();
                Address add = new Address(s1, s2, s3);
                PhoneNumber num = new PhoneNumber(s4, s5);
                Contact[] peer = new Contact[500] ;
                peer[j] = new Contact(s6, s7, s8,
                        s9, num, add);
                System.out.println(test.addContact(peer[j]));
                j++ ;
            }
            else if (n == 2) {
                System.out.println("enter the First name");
                String s8 = input.next();
                System.out.println("enter the Last name");
                String s9 = input.next();
                System.out.println(test.deleteContact(s8 , s9));
            }
            else if (n == 3) {
                System.out.println("enter the First name");
                String s8 = input.next();
                System.out.println("enter the Last name");
                String s9 = input.next();
                System.out.println(test.findContact(s9 , s9));
            }
            else if (n == 4) {
                System.out.println("enter the Group name:");
                String s6 = input.next();
                System.out.println(test.findContacts(s6));
            }
            else if (n == 5) {
                test.printContacts();
            }
        }

    }

}