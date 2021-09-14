/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        String temp1 = scanner.nextLine();
        int principle = Integer.parseInt(temp1);

        System.out.print("Enter the rate of interest: ");
        String temp2 = scanner.nextLine();
        float interest_rate = Float.parseFloat(temp2);

        System.out.print("Enter the number of years: ");
        String temp3 = scanner.nextLine();
        int num_of_years = Integer.parseInt(temp3);

        //A = P(1 + rt)
        float final_amount = (float) principle * (1 + ((interest_rate/100) * num_of_years));

        //After 4 years at 4.3%, the investment will be worth $1758.
        System.out.println("After " + num_of_years + " years at " + interest_rate + "%, " +
                "the investment will be worth $" + String.format("%.0f", final_amount) + ".");
    }
}
