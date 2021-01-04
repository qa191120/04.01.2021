package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)  {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        String s1 = "hello"; // --> ['h','e','l','l','o'] == 5
        System.out.println(s1.length()); // 5

        System.out.println("Enter a word:");
        String word = s.nextLine();
        System.out.println(String.format("size of '%s' is %d", word, word.length()));
    }
}
