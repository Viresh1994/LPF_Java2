package org.example.operators;

import java.util.Scanner;

public class ifElsestmt {
    public static void main(String[] args) {
        ifElsestmt ifelse = new ifElsestmt();
        ifelse.readDigitandWriteinWord();

        ifelse.displayUnit();
    }

    private void displayUnit() {
        Scanner input = new Scanner(System.in);
        int thousand=0;
        int hundreds=0;
        int tens=0;
        int ones=0;

        //input 4 digit number

        System.out.println("Enter 4 digit number:");
        int number = input.nextInt();
        if(number <= 9999 && number >999){
            thousand = number/1000;
            System.out.println("thousands place digit:" + thousand);

            hundreds = number/100;
            System.out.println("hundreds place digit:" + hundreds);

            tens = number/10;
            System.out.println("tens place digit:" + tens);

            ones = number/1;
            System.out.println("ones place digit:" + ones);
        } else {
            if(number > 9999)
            System.out.println("\n Error! Number more  than digits ");
            if(number < 1000)
                System.out.println("\n Error! Number less  than 4 digits ");
        }
    }

    private void readDigitandWriteinWord() {
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("Enter the choice of digit :- ");
        ch=sc.nextInt();
        if(ch == 1 ) {
            System.out.println("One");
        } else if (ch == 2) {
            System.out.println("Two");
        } else if (ch == 3) {
            System.out.println("Three");
        } else if (ch == 4) {
            System.out.println("Four");
        } else if (ch == 5) {
            System.out.println("Five");
        }else if (ch == 6) {
            System.out.println("Six");
        }else if (ch == 7) {
            System.out.println("Seven");
        }else if (ch == 8) {
            System.out.println("Eight");
        }else if (ch == 9) {
            System.out.println("Nine");
        } else{
            System.out.println("Not a digit");
        }
    }
}
