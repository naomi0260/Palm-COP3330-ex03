package ex03base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Naomi Palm
 */

import java.util.Scanner;

public class app {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        app newApp = new app();

        System.out.println("What is the quote?: ");
        String quote = input.nextLine();
        System.out.println("Who said it?: ");
        String whoSaid = input.nextLine();


        String outPut = newApp.stringConCat(quote, whoSaid);

        System.out.println(outPut);


    }

    private String stringConCat(String tempQuote, String who){
        return "" + who + " says, \"" + tempQuote + "\"";
    }
}
