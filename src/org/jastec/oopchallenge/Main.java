package org.jastec.oopchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient("Brad",22,
                new Eye("LeftEye","Short sighted","blue",true),
                new Eye("RightEye","Normal","blue",true),
                new Heart("Heart","Normal",65),
                new Stomach("Stomach","PUD",false),
                new Skin("Skin","Burned","White",40));


        System.out.println("Name " + patient.getName());
        System.out.println("Age : " + patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shouldFinish = false;

        while(!shouldFinish) {
            System.out.println("Choose an Organ" +
                    "\n\t1. Left Eye" +
                    "\n\t2. Right Eye" +
                    "\n\t3. Heart Eye" +
                    "\n\t4. Stomach Eye" +
                    "\n\t5. Skin Eye" +
                    "\n\t6. Quit" );

            int choice = scanner .nextInt();
            switch (choice){
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpened()){
                        System.out.println("\t\t 1. Close the Eye");
                        if(scanner.nextInt() == 1)
                            patient.getLeftEye().close();
                        else
                            continue;
                    }
                    else{
                        System.out.println("\t\t1. Open the Eye");
                        if (scanner.nextInt() == 1){
                            patient.getLeftEye().open();
                        }
                        else{
                            continue;
                        }
                    }

                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpened()){
                        System.out.println("\t\t 1. Close the Eye");
                        if(scanner.nextInt() == 1)
                            patient.getRightEye().close();
                        else
                            continue;
                    }
                    else{
                        System.out.println("\t\t1. Open the Eye");
                        if (scanner.nextInt() == 1){
                            patient.getRightEye().open();
                        }
                        else{
                            continue;
                        }
                    }

                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate");
                    if(scanner.nextInt() == 1){
                        System.out.println("Enter the new Heart rate: ");
                        int newHeartRate = scanner.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("Heart rate Changed to: " + patient.getHeart().getRate());
                    }
                    else{
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if(scanner.nextInt() == 1)
                        patient.getStomach().digest();
                    else{
                        continue;
                    }
                    break;

                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish = true;
                    break;


            }

        }
    }
}
