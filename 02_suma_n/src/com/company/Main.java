package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        /* Haz un programa que muestre en
        pantalla la suma de los primeros N números enteros.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("¿ Cuántos números quieres sacar en pantalla ?: ");
        int n = Integer.parseInt(br.readLine());

        int suma = 0;
        for (int i = 0; i < n; i++) {

            System.out.print("dime un número: ");
            int numero = Integer.parseInt(br.readLine());

            suma += numero;


        }

        System.out.println("La suma es: " + suma);
    }
}
