package org.example.operators;

import java.util.Scanner;

public class ifElsestmt {
    public static void main(String[] args) {
        ifElsestmt ifelse = new ifElsestmt();
        ifelse.readDigitandWriteinWord();
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
