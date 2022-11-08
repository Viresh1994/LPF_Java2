package org.example.operators;

public class naturalNo {
    public static void main(String[] args) {
        naturalNo natural = new naturalNo();
        int n = 5;
        System.out.println(natural.findSum(n));

    }

    private int findSum(int n) {
        int sum = 0;
        for(int x=1; x<=n; x++)
            sum = sum + x;
        return sum;
    }
}
