package org.jastec.concurrency;

public class Main {
    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {  //TODO : Working Thread
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Printing " + i + " in worker therad");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {  //TODO : This exception is will make app close
//                        e.printStackTrace();
//                    }
//                }
//
//                System.out.println("Hello from another Thread");
//            }
//        });
//
//        thread.start();
//
//
//
//        //TODO: Main Thread
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Printing " + i + " in Main therad");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        System.out.println("Hello from Main Thread");


        int a = 2 ;
        int b = 0 ;

        String name = null;

        try{
//            System.out.println(a/b);
            name.equals("Nuttakorn");
        }catch (ArithmeticException e){
            System.out.println("B was zero");
        }catch (NullPointerException e){
            System.out.println("Name was null");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
