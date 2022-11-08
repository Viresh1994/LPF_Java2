package org.example.operators;

public class vowelConstant {
    public static void main(String[] args) {
        vowelConstant vc = new vowelConstant();
        vc.vowelcheck();
    }

    private void vowelcheck() {
        char ch = 'i';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }



}
