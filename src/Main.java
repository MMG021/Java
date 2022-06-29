import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args ){

        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number");
//        int number1 = input.nextInt();
//        show(number1);

        System.out.print("Enter your Age");
        int age = input.nextInt();

        age = age * 12;

        System.out.println("Your age in Months is = " + age);
        System.out.println("Your age in days = " + age * 30);
        System.out.println("Your age in hours is " + age * 24 );
    }

    public static void show(int num1){
        System.out.println("Your number is "+ num1);

    }
}
