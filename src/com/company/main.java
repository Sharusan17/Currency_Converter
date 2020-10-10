package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Made variables for the currency rates.
        double GBP_EURO_RATE = 1.08;
        double GBP_USD_RATE = 1.27;
        double GBP_JPY_RATE = 135;

        double EURO_GBP_RATE = 0.89;
        double EURO_USD_RATE = 1.16;
        double EURO_JPY_RATE = 123;

        double USD_GBP_RATE = 0.76;
        double USD_EURO_RATE = 0.84;
        double USD_JPY_RATE = 104;

        double JPY_GBP_RATE = 0.01;
        double JPY_EURO_RATE = 0.01;
        double JPY_USD_RATE = 0.01;

        //this is going to display a welcome message and ask the user to enter their money
        System.out.println("Hi, Welcome To Your Local Converter");
        System.out.println("Enter Your Money:");
        double money = scanner.nextDouble();
        // allow them to choose what currency conversion.
        System.out.println("Choose a conversion:");
        System.out.println(" 1.Convert from GBP");
        System.out.println(" 2.Convert from EURO");
        System.out.println(" 3.Convert from USD");
        System.out.println(" 4.Convert from JPY");

        int mainopt = scanner.nextInt();

        //this is working out the actual value of the money in their currency by multiplying the rate with the money
        // and going to display them with the correct money signs

        String GBP_EURO = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(money * GBP_EURO_RATE);
        String GBP_USD = NumberFormat.getCurrencyInstance(Locale.US).format(money * GBP_USD_RATE);
        String GBP_JPY = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(money * GBP_JPY_RATE);

        String EURO_GBP = NumberFormat.getCurrencyInstance().format(money * EURO_GBP_RATE);
        String EURO_USD = NumberFormat.getCurrencyInstance(Locale.US).format(money * EURO_USD_RATE);
        String EURO_JPY = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(money * EURO_JPY_RATE);

        String USD_GBP = NumberFormat.getCurrencyInstance().format(money * USD_GBP_RATE);
        String USD_EURO = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(money * USD_EURO_RATE);
        String USD_JPY = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(money * USD_JPY_RATE);

        String JPY_GBP = NumberFormat.getCurrencyInstance().format(money * JPY_GBP_RATE);
        String JPY_EURO = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(money * JPY_EURO_RATE);
        String JPY_USD = NumberFormat.getCurrencyInstance(Locale.US).format(money * JPY_USD_RATE);

        //this while loop will ask the user again if they enter an integer outside the range 1-4

        while (true) {
            if(mainopt < 1 || mainopt > 4) {
                System.out.println("Choose from 1-4");
                mainopt = scanner.nextInt();
                continue;
            }
            break;
        }

        System.out.println("--------------------------------------------------------------");

        //the user will choose an option between 1-4 and respect within the option it would display all of the conversion

        if (mainopt == 1) {
            System.out.println(" GBP TO EURO: " + GBP_EURO);
            System.out.println(" GBP TO USD:  " + GBP_USD);
            System.out.println(" GBP TO JPY:  " + GBP_JPY);
        }

        if (mainopt == 2) {
            System.out.println(" EURO TO GBP: " + EURO_GBP);
            System.out.println(" EURO TO USD: " + EURO_USD);
            System.out.println(" EURO TO JPY: " + EURO_JPY);
        }

        if (mainopt == 3) {
            System.out.println(" USD TO GBP:  " + USD_GBP);
            System.out.println(" USD TO EURO: " + USD_EURO);
            System.out.println(" USD TO JPY:  " + USD_JPY);
        }

        if (mainopt == 4) {
            System.out.println(" JPY TO GBP:  " + JPY_GBP);
            System.out.println(" JPY TO EURO: " + JPY_EURO);
            System.out.println(" JPY TO USD:  " + JPY_USD);
        }
        System.out.println("--------------------------------------------------------------");

    }
}