package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] telefonos = new String[50];
        String[] nombres = new String[50];

        int n = 0;
        String respuesta = null;
        String telefono = null;
        do {
            do {
                System.out.println("Teléfono:");
                telefono = br.readLine();
            } while (telefono.length() != 9);

            System.out.println("Nombre:");
            String nombre = br.readLine();

            telefonos[n] = telefono;
            nombres[n] = nombre;


            n++;
            System.out.println("¿Quieres continuar? sino escribe FIN");
            respuesta = br.readLine();



        } while (n < 50 && !respuesta.equalsIgnoreCase("FIN"));


        /*Después permitiremos que el usuario busque una entrada en la guía por nombre,
        teléfono o que muestre la guía completa.*/

        String busqueda = null;
        do {
            System.out.println("1. Búsqueda por nombre: ");
            System.out.println("2. Búsqueda por teléfono: ");
            System.out.println("3. Listado completo: ");

            System.out.print("Opción: ");
            int opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1:
                    System.out.print("1.Escribe el nombre que quieres buscar:");
                    String eleccion = br.readLine();
                    int i = 0;
                    while (i < nombres.length && !eleccion.equalsIgnoreCase(nombres[i])) {
                        i++;
                    }

                    if (i < nombres.length) {
                        System.out.println("Teléfono: " + telefonos[i]);
                    } else {
                        System.err.println("El nombre introducido no existe");
                    }

                    break;
                case 2:
                    i = 0;
                    System.out.print("Escribe el nombre que quieres buscar:");
                    eleccion = br.readLine();

                    if (i < telefonos.length) {
                        System.out.println("Nombre: " + nombres[i]);
                    } else {
                        System.err.println("El nombre introducido no existe");
                    }
                    break;
                case 3:
                    // Muestre guía completa
                    int j = 0;
                    while (j < nombres.length) {
                        if (nombres[j] == null) {
                            j++;
                        } else {
                            System.out.println(nombres[j]);

                        }
                    }


            }

            System.out.print("¿Quieres buscar otro nombre?(s/n) ");
            busqueda = br.readLine();


        }while( busqueda.equalsIgnoreCase("s"));

        }


}