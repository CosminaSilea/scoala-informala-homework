package sciit.homework.functions.ex3;

import java.util.Scanner;

public class WhatTimeIsIt {
    public static void main(String[] args) {

        System.out.println("What time is it?");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the number that represent the hour");
        int hour = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Insert the number that represent the minutes");
        int minutes = sc.nextInt();

        System.out.println(checkHourMinutesFormat(hour, minutes));
    }

    public static String checkHourMinutesFormat(int hour, int minutes) {

        String msg = "";

        if (hour < 0 || hour > 24 || minutes < 0 || minutes >= 60) {
            msg = "Incorrect time";
        } else {
            msg = "The time is " + hour + ":" + minutes;
        }
        return msg;


    }


}

