package com.spring.day18;

import com.spring.day18.service.StudentService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.doService();
    }

    public void doService() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Please Select One : (only number)");
            System.out.println("1. Insert ");
            System.out.println("2. Update ");
            System.out.println("3. Delete");
            System.out.println("4. Find");
            System.out.println();

            String serviceTypes = input.nextLine();
            serviceType(serviceTypes);

        } while (startAgain());

    }

    private static boolean startAgain() {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to startAgain? (Yes Or No) :");
        System.out.println("Please enter Yes or No :");
        String exit = input.nextLine();
        return "Yes".equals(exit);
    }


    private static void serviceType(String serviceType) {


        StudentService studentService = null;
        if (studentService == null) {
            studentService = new StudentService();
        }
        switch (serviceType) {
            case "1":
                studentService.insert();
                break;
            case "2":
                studentService.update();
                break;
            case "3":
                studentService.delete();
                break;
            case "4":
                studentService.findById();
                break;
            default:
                break;
        }

    }
}
