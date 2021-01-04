package com.company;

public class Main
{
    // 1
    public static void main(String[] args)  {

        wakeUpInTheMorning();
        goToCar();
        driveToWork();
        goToDinner();
        goToMovie();
        goToSleep();

        print1To10();
        print10To20();
        driveToWork();
    }

    private static void print1To10() {
        for (int index = 1; index <= 10; index++)
        {
            System.out.println(index);
        }
    }

    private static void print10To20() {
        for (int index = 10; index <= 20; index++)
        {
            System.out.println(index);
        }
    }
    
    private static void goToSleep() {
        System.out.println("ZzzzzZzzzzz...");
    }

    private static void goToMovie() {
        System.out.println("First popcorn...");
    }

    private static void goToDinner() {
        System.out.println("yum yum yum ");
    }

    private static void driveToWork() {
        System.out.println("beep beep");
    }

    private static void goToCar() {
        System.out.println("turn off alaram");
    }

    private static void wakeUpInTheMorning() {
        System.out.println("Snoozee ...");
    }


}
