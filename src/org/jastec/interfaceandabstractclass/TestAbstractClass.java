package org.jastec.interfaceandabstractclass;

public abstract class TestAbstractClass {

    // TODO: we can have method body in Abstract Class and properties and getter setter

    private String name;

    public TestAbstractClass(String name) {
        this.name = name;
    }



    public abstract void printName(String name);

    public void print(String text){
        System.out.println(text);
    }

}
