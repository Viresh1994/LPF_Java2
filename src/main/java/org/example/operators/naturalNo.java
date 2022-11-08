package org.example.operators;

public class naturalNo {
    public static void main(String[] args) {
        naturalNo natural = new naturalNo();
        int n = 5;
        System.out.println(natural.findSum(n));

        natural.reverseNo();

    }

    private void reverseNo() {
        int num = 987654, rev=0;
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        System.out.println(" The reverse of the given numbers is: " + rev);
    }

    private int findSum(int n) {
        int sum = 0;
        for(int x=1; x<=n; x++)
            sum = sum + x;
        return sum;
    }
}
