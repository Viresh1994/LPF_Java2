package org.example.operators;

import java.util.Scanner;

public class Arithmaticop {
        public static void main(String[] args) {

                int a, b, c;
                int res1, res2, res3, res4;
                double max, min;
                Scanner sc;

                System.out.println("Enter three numbers  a b c");
                sc = new Scanner(System.in);
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                res1 = a + b * c;
                res2 = c + a / b;
                res3 = a % b + c;
                res4 = a * b + c;
                Arithmaticop aop = new Arithmaticop();
                aop.max(res1, res2, res3, res4);

                aop.min(res1, res2, res3, res4);
        }

        private void min(int res1, int res2, int res3, int res4) {
                if (res1 < res2) {
                        if (res1 < res3) {
                                if (res1 < res4)
                                        System.out.println("Min is res1: " + res1);
                                else
                                        System.out.println("Min is res4: " + res4);
                        } else {
                                if (res3 < res4)
                                        System.out.println("Min is res3: " + res3);
                                else
                                        System.out.println("Min is res4: " + res4);
                        }
                } else {
                        if (res2 < res3) {
                                if (res2 < res4)
                                        System.out.println("Min is res2: " + res2);
                                else
                                        System.out.println("Min is res4: " + res4);
                        } else {
                                if (res3 < res4)
                                        System.out.println("Min is res3: " + res3);
                                else
                                        System.out.println("Min is res4: " + res4);
                        }
                }
        }

        public void max(int res1, int res2, int res3, int res4) {
                if (res1 > res2) {
                        if (res1 > res3) {
                                if (res1 > res4)
                                        System.out.println("Max is res1: " + res1);
                                else
                                        System.out.println("Max is res4: " + res4);
                        } else {
                                if (res3 > res4)
                                        System.out.println("Max is res3: " + res3);
                                else
                                        System.out.println("Max is res4: " + res4);
                        }
                } else {
                        if (res2 > res3) {
                                if (res2 > res4)
                                        System.out.println("Max is res2: " + res2);
                                else
                                        System.out.println("Max is res4: " + res4);
                        } else {
                                if (res3 > res4)
                                        System.out.println("Max is res3: " + res3);
                                else
                                        System.out.println("Max is res4: " + res4);
                        }
                }
        }
}


