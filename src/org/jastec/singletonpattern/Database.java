package org.jastec.singletonpattern;

public class Database {
    private String name;


    // static instance
    private static Database instance;


    //TODO: synchronized keyword is protect others Thread to create more Instance mean that this instance will share
    // through all Thread
    public static synchronized Database getInstance(String name){
        if(null == instance){
            instance = new Database(name);
        }
        return instance;
    }


    // private Constructor for protect initiate new instance and can only access by getInstance
    private Database(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "Database class\n" +
                "Name: " + this.name;
    }
}
