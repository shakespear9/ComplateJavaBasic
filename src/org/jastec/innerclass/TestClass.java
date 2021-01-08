package org.jastec.innerclass;

public class TestClass {

    private int age;
    private String color;



    private class TestInnerClass{
        private String name;

        public TestInnerClass(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private void printAge(){
            System.out.println("Age: " + age);  // TODO: InnerClass can access outer class properties
        }
    }


}
