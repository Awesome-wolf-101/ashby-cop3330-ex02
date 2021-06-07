/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.util.Scanner;

public class APP {
    public static void main(String[] args){
        System.out.println("What is the input string?");
        Scanner sc = new Scanner(System.in);
        String InputString = sc.nextLine();
        String OutPutString = InputString;
        int letters = InputString.length();
        OutPutString += " has " + letters;
        OutPutString += " characters.";
        System.out.print(OutPutString);


    }
}
