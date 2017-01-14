package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un número: ");
        int n1 = Integer.parseInt(br.readLine());

        System.out.print("Escribe otro número: ");
        int n2 = Integer.parseInt(br.readLine());

        String opcion = "";
        int r = 0;
        do {

            do {
                System.out.println("a) + ");
                System.out.println("b) - ");
                System.out.println("c) * ");
                System.out.println("d) / ");
                System.out.println("e) Terminar.");
                System.out.print("Elige una opción: ");
                opcion = br.readLine();

            } while (!opcion.equals("a")&&!opcion.equals("b")&&!opcion.equals("c")
                    &&!opcion.equals("d")&&!opcion.equals("e"));


            switch (opcion) {
                case "a":
                    r = n1 + n2;
                    break;
                case "b":
                    r = n1 - n2;
                    break;
                case "c":
                    r = n1 * n2;
                    break;
                case "d":
                    r = n1 / n2;
                    break;
                case "e":
                    System.out.println("saliendo....");
                    break;

            }

            if (!opcion.equals("e")) {
                System.out.println("Resultado: " + r);
            }




        } while (!opcion.equals("e"));






    }
}
