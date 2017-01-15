package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /*public static char cifrar(char[] texto, char[] descifrado) {


        int[] cifrado = new int[descifrado.length];


        // Recorrido
        for (int i = 0; i < texto.length; i++) {

            int j = 0;

            // Búsqueda lineal en un array
            while (j < descifrado.length && texto[i] != descifrado[j]) {
                j++;
            }

            if (j < descifrado.length) {
                cifrado[j] = alfabeto[j] + 13;
            }
        }

        return cifrado;
    }

*/


   /* public static char descifrar(){

    }*/

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] descifrado = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                           'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                           's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char[] cifrado = new char[26];


        System.out.println(cifrado[0]);

        char opcion = ' ';
        do {
            System.out.println("MENÚ");
            System.out.println("-------");
            System.out.println("a) Cifrar");
            System.out.println("b) Descifrar");
            System.out.println("c) Terminar");

            opcion = br.readLine().charAt(0);

            switch(opcion){
                case 'a':
                    for (int i = 0; i < 26 ; i++) {
                        cifrado[i] = descifrado[i+13];
                        System.out.println(cifrado[i]);
                    }
                    break;
                case 'b':
                    for (int i = 0; i < 26; i++) {
                        System.out.println(cifrado[i]);   

                    }
                    break;


            }

        }while(opcion != 'c');

    }
}
