package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*



    Convertir esos valores a números enteros, truncando la parte decimal
    si es necesario.
    Mostraremos el valor absoluto de los dos números.

	 */


	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un valor en coma flotante: ");
        float f1 = Float.parseFloat(br.readLine());

        System.out.print("Escribe otro valor en coma flotante: ");
        float f2 = Float.parseFloat(br.readLine());

        int n1 = (int)f1;
        int n2 = (int)f2;

        System.out.println(n1);
        System.out.println(n2);





    }
}
