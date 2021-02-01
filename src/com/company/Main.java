package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }

    public static void Task1() {

        System.out.print("Please write number of a day (1-7): ");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is working day!");
                break;
            case 6:
            case 7:
                System.out.println("It is holiday!");
                break;
            default:
                System.out.println("Number is incorrect! Choose from 1 to 7.");
        }

    }

    public static void Task2(){


        System.out.print("Please write your grade from A to F: ");
        Scanner scanner = new Scanner(System.in);
        char grade = scanner.next().charAt(0);


        switch (grade) {
            case 'A':
            case 'a':
            case 'B':
            case 'b':
                System.out.println("Perfect! You are so clever!");
                break;
            case 'C':
            case 'c':
                System.out.println("Good! But You can do better!");
                break;
            case 'D':
            case 'd':
            case 'E':
            case 'e':
                System.out.println("It is not good! You should study!");
                break;
            case 'F':
            case 'f':
                System.out.println("Fail! You need to repeat the exam!");
                break;
            default:
                System.out.println("Grade is incorrect! You should choose letters from  A to F.");
        }


    }

    public static void Task3(){

        Scanner scanner = new Scanner(System.in); // this is for char to work
        Scanner input = new Scanner(System.in);

        System.out.print("Please write first number ");
        int x = input.nextInt();;
        System.out.print("Please write second number ");
        int y = input.nextInt();;

        System.out.print("Please choose operation(+,-,/,*,%,p,b,s): ");
        char z = scanner.next().charAt(0);


        switch (z) {
            case '+':
                System.out.println(x + "+" + y + "=" + (x+y)) ;
                break;
            case '-':
                System.out.println(x + "-" + y + "=" + (x-y));
                break;
            case '/':
                System.out.println(x + "/" + y + "=" + (x/y));
                break;
            case '*':
                System.out.println(x + "*" + y + "=" + (x*y));
                break;
            case '%':
                System.out.println(x + "%" + y + "=" + (x%y));
                break;
            case 'p':
            case 'P':
                System.out.println("First number is '" +x+ "', second number is '"+ y +"'");
                break;
            case 'b':
            case 'B':
                if(x>y) {
                    System.out.println ("Bigger number is " + x);
                } else if (x<y) {
                    System.out.println ("Bigger number is " + y);
                } else {
                    System.out.println("Both variables are equal");
                }
                break;
            case 's':
            case 'S':
                if(x<y) {
                    System.out.println ("Smallest number is " + x);
                } else if (x>y) {
                    System.out.println ("Smallest number is " + y);
                } else {
                    System.out.println("Both variables are equal");
                }
                break;
            default:
                System.out.println("Something went wrong. Choose from (+,-,/,*,%,p,b,s)");
        }


    }

}
