package org.jastec.interfaceandabstractclass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CarInterface carInterface = new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(80);

        List<String> names = new ArrayList<>();

        CarInterface fossilCarInterface = new FossilFuelCar("Mercedes");
        fossilCarInterface.start();
        fossilCarInterface.move(100);

        TestAbstractClass testAbstractClass = new TestClass("Nuttakorn");
        testAbstractClass.printName("Tedthong");




    }
}
