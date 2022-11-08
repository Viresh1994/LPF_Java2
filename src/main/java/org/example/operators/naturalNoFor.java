package org.example.operators;

public class naturalNoFor {
    public static void main(String[] args) {
        naturalNoFor naturalno = new naturalNoFor();
        naturalno.naturalNoUsingFor();

        naturalno.reverseusingFor();

        naturalno.palindrome();
    }

    private void palindrome() {
        String str = "Radar", reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }

    private void reverseusingFor() {
        int number=12345, rev=0;
        for(;number!=0; number=number/10){
            int remainder = number%10;
            rev=rev*10+remainder;
        }
        System.out.println("The reverse of the given number is: " + rev);

    }

    private void naturalNoUsingFor() {
        int N=10;
        int sum=0;
        for(int i=1; i<=N; i++){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum of first " + N
                + " Natural Number = " + sum);
    }
}
