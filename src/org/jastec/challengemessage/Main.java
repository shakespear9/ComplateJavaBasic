package org.jastec.challengemessage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Contact> contacts;
    private static Scanner scanner;
    private static int id = 0;

    public static void main(String[] args) {

        contacts = new ArrayList<>();
        System.out.println("Welcome to my humber world of programming");

        showInitialOptions();


    }

    private static void showInitialOptions(){
        System.out.println("Please select one : " +
                "\n\t1. Manage Contacts" +
                "\n\t2. Messages" +
                "\n\t3. Quit");

        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                manageContact();
                break;
            case 2:
                manageMessages();
                break;
            default:
                break;
        }
    }

    private static void manageMessages() {
        System.out.println("Please Select one:" +
                "\n\t1. See the list of all message" +
                "\n\t2. Send a new message" +
                "\n\t3. Go Back");

        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                showAllMessages();
                break;
            case 2:
                sendNewMessage();
                break;
            default:
                showInitialOptions();
                break;
        }
    }

    private static void sendNewMessage() {
        System.out.println("Who are you goinh to send a message?");
        String name = scanner.next();

        if(name.equals("")){
            System.out.println("Please enter the name of th e contact");
            sendNewMessage();
        }else{
            boolean doesExist = false;
            for(Contact contact: contacts){
                if(contact.getName().equals(name)){
                    doesExist = true;

                }
            }

            if (doesExist){
                System.out.println("What are you going to say?");
                String text = scanner.next();
                if(text.equals("")){
                    System.out.println("Please enter some message");
                    sendNewMessage();

                }else
                {
                    id ++;
                    Message newMessage = new Message(text,name,id);
                    for(Contact contact: contacts){
                        if(contact.getName().equals(name)){
                            ArrayList<Message> newMessages = contact.getMessages();
                            newMessages.add(newMessage);
                            contact.setMessages(newMessages);
//                            Contact currentContact = contact;
//                            currentContact.setMessages(newMessages);
//                            contacts.remove(contact);
//                            contacts.add(currentContact);

                        }
                    }

                }
            }else{
                System.out.println("There is no suct contact name");
            }
        }
        showInitialOptions();
    }


    private static void showAllMessages() {
        ArrayList<Message> allMessages = new ArrayList<>();
        for(Contact contact:contacts){
            allMessages.addAll(contact.getMessages());
        }

        if(allMessages.size()> 0){
            for(Message m: allMessages){
                m.getDetails();
                System.out.println("*******************");
            }
        }else{
            System.out.println("You don't have any message");
        }
        showInitialOptions();
    }

    private static void manageContact(){
        System.out.println("Please Select one:" +
                "\n\t1. Show all contacts" +
                "\n\t2. Add a new contact" +
                "\n\t3. Search for a contact" +
                "\n\t4. Delete a contact" +
                "\n\t5. Go Back");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showAllContact();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                searchForContact();
                break;
            case 4:
                deleteContact();
                break;
            default:
                showInitialOptions();
                break;
        }
    }

    private static void deleteContact() {
        System.out.println("Please enter the contact's name: ");
        String name = scanner.next();

        if(name.equals("")){
            System.out.println("Please enter the name");
            deleteContact();

        }else{
            boolean doesExist = false;
            for(Contact contact:contacts){

                if(contact.getName().equals(name)){
                    doesExist = true;
                    contacts.remove(contact);
                    break;
                }
            }

            if(!doesExist){
                System.out.println("There is no such contact");
            }

        }
        showInitialOptions();
    }

    private static void searchForContact() {
        System.out.println("Please enter the contact's name: ");
        String name = scanner.next();
        if(name.equals("")){
            System.out.println("Please enter the name");
            searchForContact();
        }else{
            boolean doesExist = false;
            for (Contact contact:
                 contacts) {
                if (contact.getName().equals(name)){
                    contact.getDetails();
                    doesExist = true;
                }
            }

            if(!doesExist) {
                System.out.println("There is no such contact in your phone");
            }

            showInitialOptions();
        }

    }

    private static void addNewContact() {

        System.out.println("Adding a new contact ..." +
                "\n Please enter that contact's name: ");

        String name = scanner.next();

        System.out.println("Please enter contact's number: ");

        String number = scanner.next();

        System.out.println("Please enter contact's email: ");

        String email = scanner.next();

        if(name.equals("") || number.equals("") || email.equals("")){
            System.out.println("Please enter all of the information");
            addNewContact(); //TODO: recursive call
        }else {
            boolean doesExist = false;
            for(Contact contact: contacts){
                if (contact.getName().equals(name)) {
                    doesExist = true;
                    break;
                }
            }

            if (doesExist){
                System.out.println("We already have contact with this name");
                addNewContact();
            }else {

                Contact contact = new Contact(name, number, email);
                contacts.add(contact);
                System.out.println(name + "added successfully");
            }
        }

        showInitialOptions();
    }

    private static void showAllContact() {
        if (contacts.size() > 0 ){
            for(Contact contact:contacts){
                contact.getDetails();
                System.out.println("********************************************");
            }
        }
        else{
            System.out.println("You do not have any contact");
        }

        showInitialOptions();
    }




}
