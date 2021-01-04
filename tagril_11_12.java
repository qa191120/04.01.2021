package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)  {

        Scanner s   = new Scanner(System.in);
        Random r = new Random();

        /*
        System.out.println("Please enter number:");
        int x = s.nextInt();
        int reminder = x % 2;
        if (x % 2 == 0) {
            System.out.println("zugi");
        }
        else
        {
            System.out.println("e-zugi");
        }
*/
        System.out.println(8 % 2);
        // 9/2 =  4 1/2 ==> 1
        // 8/2 =  4 0/2 ==> 0
        // 9/3 =  3 0/3 ==> 0
        // 14/4 = 3 2/4 ==> 2

        int count = 0;
        for (int index = 1; index <= 5; index++)
        {
            int number = r.nextInt(50) + 1;
            System.out.println(number);
            if (number % 2 == 0) {
                System.out.println("zugi");
                count++;
            }
            else
            {
                System.out.println("e-zugi");
            }
        }

        if (count == 5) {
            System.out.println("all are even");
        }
        else {
            System.out.println("not all are even");
        }
    }
}
