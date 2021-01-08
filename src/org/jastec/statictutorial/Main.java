package org.jastec.statictutorial;

public class Main {
    public static void main(String[] args) {


        TestClass testClass = new TestClass(25,"White");
        TestClass.name = "Nuttakorn";


        System.out.println("Name: " + testClass.getName());

        TestClass testClass2 = new TestClass(22,"Brown");

        System.out.println("Name: "+ testClass2.getName());

        testClass.printSomething();

    }
}
