package org.jastec.oop2;

public class MainAnimal {
    public static void main(String[] args) {
        Bird phoenix = new Bird("Nina","Golden",2,true,2);
        System.out.println(phoenix.getName());
        phoenix.eat("water");

        System.out.println(phoenix.getWings());

        phoenix.fly();
    }
}
