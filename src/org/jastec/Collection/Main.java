package org.jastec.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Nuttakorn");
        names.add("Tedthong");
//        System.out.println(names.get(0));
//        System.out.println(names.get(1));
//
////        names.clear();
//
//        System.out.println(names.size());
//
//        names.remove("Nuttakorn");
//        System.out.println(names.get(0));
//        System.out.println(names.contains("Tedthong"));
//        names.remove("Tedthong");
//        System.out.println(names.isEmpty());

//        System.out.println(names.indexOf("Nuttakorn")); // 0 found -1 not found
//
//        for (int i = 0 ; i < names.size(); i++){
//            System.out.println(names.get(i));
//        }

        Map<String,String> emailList = new HashMap<>();
        emailList.put("Nuttakorn","Nuttakorn@hotmail.com");

        emailList.put("Jiheon","BB");
        System.out.println(emailList.get("Jiheon"));
        System.out.println(emailList.size());
        emailList.remove("Jiheon");
        System.out.println(emailList.size());
        System.out.println(emailList.containsKey("Jiheon"));
        System.out.println(emailList.containsValue("Nuttakorn@hotmail.com"));

//        Collection

        ArrayList<Student> students = new ArrayList<>();
        students.add((new Student("Nuttakorn",53251)));


        for (Student student: students
             ) {
            System.out.println(student.getName());

        }



    }


}
