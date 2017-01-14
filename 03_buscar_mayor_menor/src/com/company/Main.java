package com.company;

import java.util.Random;

public class Main {

    /**
     * Muestra el array en pantalla
     * @param n
     */
    public void visualizar(int[] n){

        for (int i = 0; i < 10 ; i++) {
            System.out.println(n[i]);
        }

    }

    /**
     * Muestra el número más alto que haya en el array.
     * @param n
     * @return
     */
    public int buscarMayor(int[] n){

        public static int[] contarLetras(char[] texto, char[] alfabeto) {

            // Declaración
            int[] recuento = new int[alfabeto.length];

            // Inicialización
            for (int i = 0; i < alfabeto.length; i++) {
                recuento[i] = 0;
            }
        // recorrido
        for (int i = 0; i < 10 ; i++) {



                int j = 0;

                // Búsqueda lineal en un array
                while (j < 10 && n[i] != alfabeto[j]) {
                    j++;
                }

                if (j < alfabeto.length) {
                    recuento[j] += 1;
                }
            }


        }


        }

        return 0;
    }

    /**
     * Muestra el número más pequeño que haya en el array.
     * @param n
     * @return
     */

    public int buscarMenor(int[] n){



    }

    /**
     * Devuelve true si el valor buscado existe en el array.
     * @param n
     * @return
     */

    public boolean existe(int[] n){


        return true;
    }
    public static void main(String[] args) {

        Random r = new Random();
        int aleatorio = r.nextInt();

	    int[] numero = new int[10];

        for (int i = 0; i < 10; i++) {
            numero[i] = aleatorio;

        }


    }
}
