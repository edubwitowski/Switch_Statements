package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int month = 8;
        System.out.print("Enter a number one to nine:  ");
        String input = sc.nextLine();
        int number = Integer.parseInt(input);
        String monthString;
        switch (number) {
            case 1:  monthString = "#1 or Ena is in Greek";
                break;
            case 2:  monthString = "#2 or dos is in Spanish";
                break;
            case 3:  monthString = "#3 or San is in Japanese";
                break;
            case 4:  monthString = "#4 or Quattuor is in Japanese";
                break;
            case 5:  monthString = "#5 or Nam is in Vietnamese";
                break;
            case 6:  monthString = "#6 or Seis is in Spanish";
                break;
            case 7:  monthString = "#7 or Septum is in Latin";
                break;
            case 8:  monthString = "#8 or Tam is in Vietnamese";
                break;
            case 9:  monthString = "#9 or Kyu is in Japanese";
                break;
            default: monthString = "Invalid number";
                break;
        }
        System.out.println(monthString);
    }
}
