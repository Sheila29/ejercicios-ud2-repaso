package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Pide al usuario filas y columnas
        System.out.print("Filas: ");
        int filas = Integer.parseInt(br.readLine());

        System.out.print("Columnas: ");
        int columnas = Integer.parseInt(br.readLine());

        Random r = new Random();
        int aleatorio = r.nextInt(6);

        // Generar matriz de números enteros aleatorios
        int[][] matriz = new int[filas][columnas];

        for (int f = 0; f < filas ; f++) {
            for (int c = 0; c < columnas; c++) {
                matriz[f][c] = aleatorio;
            }

        }

        // Muestra la matriz en pantalla
            for (int f = 0; f < filas ; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.format("%2d", matriz[f][c]);
            }
            System.out.println();

        }

        /* Crea un array con el tamaño suficiente para almacenar todos los valores
        de la matriz y copia en él los datos */

        int[] array = new int[matriz.length*matriz[0].length];

        for (int f = 0; f < matriz.length ; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                array[f*3+c] =  matriz[f][c];


            }

        }

        // Muestra el array.

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }


        // Muestra el array eliminando los valores repetidos

int[] recuento = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            int valor = array[i];
            // buscar valor en recuento


            int j = 0;
            while ( array[i] != valor ){
                recuento[j] = valor;
                j++;
            }


        }









    }
}
