package org.jastec.statictutorial;

public class TestClass {

    public static  String name; //TODO: this value belong to object itself not instance of object //

    public int age;
    public String skinColor;

    public TestClass(int age, String skinColor) {
        this.age = age;
        this.skinColor = skinColor;
    }

    public void print(){

    }

    public static void printSomething(){
        System.out.println("abcDEF");
//        System.out.println(age);  //TODO: static method cannot use non-static method & property(variable) inside
//         but can use Constructor
//        print();
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        TestClass.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }



}
