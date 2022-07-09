package practice;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args ){

        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number");
//        int number1 = input.nextInt();
//        show(number1);

        System.out.print("Enter your Age ");
        int age = input.nextInt();
        age = age * 12;

        System.out.println("Your age in Months is = " + age );

        System.out.println("Your age in days = " + age * 30 );

        System.out.println("Your age in hours is " + age * 30 * 24 );

        if (age <= 18) {
            System.out.println("You are teenager");
        }
            else if (age >=23 & age <=40) {
            System.out.println("You are Young");
        }
            else if ( age > 40 & age < 60 ) {
            System.out.println("you are getting old");
        }
    }



//    public static void show(int num1){
//        System.out.println("Your number is "+ num1);
//
//    }
}
