package org.jastec.oop2;

public class Animal {
    private String name;
    private String color;
    private int legs;
    private boolean hasTale;

    public Animal(String name,String color,  int legs, boolean hasTale) {
        this.color = color;
        this.name = name;
        this.legs = legs;
        this.hasTale = hasTale;
    }

    public void eat(String food){
        System.out.println("Eating " + food);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasTale() {
        return hasTale;
    }

    public void setHasTale(boolean hasTale) {
        this.hasTale = hasTale;
    }
}
