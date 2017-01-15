package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        int n1 = r.nextInt();
        int n2 = r.nextInt();
        int n3 = r.nextInt();


        if ( n1 > n2 && n1 > n3 ) {
            System.out.println("La mayor es: " + n1);
            if (n2 > n3) {
                System.out.println("La siguiente más grande es: " + n2);
                System.out.println("La menor es: " + n3);

            }
        }

        if ( n2 > n1 && n2 > n3 ) {
            System.out.println("La mayor es: " + n2);
            if (n1 > n3) {
                System.out.println("La siguiente más grande es: " + n1);
                System.out.println("La menor es: " + n3);

            }
        }

        if ( n3 > n1 && n3 > n2 ) {
            System.out.println("La mayor es: " + n3);
            if (n1 > n2) {
                System.out.println("La siguiente más grande es: " + n1);
                System.out.println("La menor es: " + n2);

            }
        }





    }
}
