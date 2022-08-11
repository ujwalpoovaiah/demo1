package com.jfrog;


import java.util.Scanner;


class Calculator{


        private static Scanner sc;


        public static void main(String[] args) {


                sc = new Scanner(System.in);


                int a = sc.nextInt();
                int b = sc.nextInt();
                String c = sc.next();
                char[] d = c.toCharArray();
                char e = d[0];
                int result = calculate(a, b, e);
                System.out.println(result);
        }


        private static int calculate(int a, int b, char e) {


                int result = 0;
                switch (e) {
                case '+':
                        result = a + b;
                        break;
                case '-':
                        result = a - b;
                        break;
                case '*':
                        result = a * b;
                        break;
                case '/':
                        try {
                                result = a / b;
                        } catch (ArithmeticException e1) {
                                e1.printStackTrace();
                                result = -1;
                        }
                        break;
                default:
                        result = -1;


                }
                return result;
        }


}