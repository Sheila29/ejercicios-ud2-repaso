package com.company;

public class Main {

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            System.out.print(" *");

        }


        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
        System.out.println();
    }

        for (int i = 5; i > 0 ; i--) {
            for (int j = i; j > 0; j--) {
                System.out.println("*");

            }
            System.out.println();
        }
    }
}
