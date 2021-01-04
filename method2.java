package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)  {

        Scanner s   = new Scanner(System.in);
        Random r = new Random();

        // 1. write a function that prints 10 random numbers
        print10RandomNumbers(r);

        // 2. write a function that inputs 10 numbers from user into an array
        //    and prints the average
        input10NumberAndPrintAvg(s);

        // 3. write a function that input two numbers and print their sum
        getTwoNumbersAndPrintSum(s);

        // 4. write a function that input user name and tells him hello
        //    now ... create a "for" loop and call this function 3 times...
        //inputNameAndGreet(s);
        //inputNameAndGreet(s);
        //inputNameAndGreet(s);
        for (int index = 1; index <= 3; index++)
        {
            inputNameAndGreet(s);
        }

        // **etgar: write a function that prints the current date
        // make sure to give your functions a clear name
        // call of these functions from main
    }

    private static void inputNameAndGreet(Scanner s) {
        System.out.println("Please tell me your name:");
        String name = s.next();
        System.out.println(String.format("Hello %s you are very smart!", name));
    }

    private static void getTwoNumbersAndPrintSum(Scanner s) {
        System.out.println("Please enter number #1:");
        int number1 = s.nextInt();
        System.out.println("Please enter number #2:");
        int number2 = s.nextInt();
        int the_sum = number1 +  number2;
        System.out.println(String.format("The sum is %d", the_sum));
    }

    private static void print10RandomNumbers(Random r) {
        for (int index = 1; index <= 10; index++)
        {
            int number = r.nextInt(100) + 1;
            System.out.println(number);
        }
    }

    private static void input10NumberAndPrintAvg(Scanner s) {
        int sum = 0;
        int[] numbers = new int[10];
        for (int index = 0; index < numbers.length; index++)
        {
            System.out.println(String.format("Please enter number #%d ", index+1));
            numbers[index] = s.nextInt();
            sum = sum + numbers[index];
        }
        double avg = (double)sum / numbers.length;
        System.out.println(String.format("average = %g", avg));
    }


}
