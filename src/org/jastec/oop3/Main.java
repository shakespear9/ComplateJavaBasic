package org.jastec.oop3;

public class Main {
    public static void main(String[] args) {

//        Engine engine = new Engine("Renault",8000);
//        Car mercedes = new Car("Mercedes SILK",2,"Black",engine);
//
//        engine = mercedes.getEngine();
//
//        System.out.println(mercedes.getEngine().getModel());

//        Car mercedes = null;
//        if (mercedes != null){
//            mercedes.getName();
//
//        }else{
//            System.out.println("The car was null");
//        }

        final int a = 5;  /// Constant Value

        final Engine engine = new Engine("Renault",8000);
        engine.setRpm(10000); /// Final allow setRpm but cannot Set the whole new Engine

    }
}
