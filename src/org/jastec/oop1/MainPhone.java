package org.jastec.oop1;

public class MainPhone {
    public static void main(String[] args) {
        Phone iPhone = new Phone();

        Phone samsung = new Phone("samsung Note",20,20,20);

        iPhone.setName("iPhone11");
        System.out.println(iPhone.getName());


        iPhone.playMusic("So Beautiful");
    }
}
