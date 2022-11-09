/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.juegobolas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
/*
El programa, una vez finaliza un cliente, pregunta si hay otro en la cola para 
operar de la misma forma. Si no hay clientes, el programa termina.
 */
public class JuegoBolas {

    public static Scanner teclado = new Scanner(System.in);
    public static Random alea = new Random();

    public static void main(String[] args) {

        int bola = 0;
        double descuento;
        double precio;
        double precioTotal;
        String cliente;

        do {
            System.out.println("¿HAY ALGÚN CLIENTE EN LA COLA?");
            cliente = teclado.nextLine();

            if (!cliente.equalsIgnoreCase("no")) {

                System.out.println("INDIQUE CUANTO CUESTA SU COMPRA");
                precio = teclado.nextDouble();

                bola = eleBola();
                switch (bola) {
                    case 1:
                        descuento = 0.2;
                        precioTotal = precio - (precio * descuento);
                        System.out.println("EN TOTAL SON: " + precioTotal + "€");
                        break;

                    case 2:
                        descuento = 0.25;
                        precioTotal = precio - (precio * descuento);
                        System.out.println("EN TOTAL SON: " + precioTotal + "€");
                        break;

                    case 3:
                        System.out.println("NO TIENES DESCUENTO\n");
                        break;
                }
                teclado.nextLine();
            } else {
                System.out.println("SALIDA");
            }

        } while (!cliente.equalsIgnoreCase("no"));

    }

    public static int eleBola() {
        int bola;
        bola = alea.nextInt(1, 4 + 1);
        //SI ES VERDE SE REPITE
        do {

            if (bola == 4) {

                System.out.println("HAS SACADO LA BOLA VERDE, SACA OTRA BOLA");
                bola = alea.nextInt(1, 3 + 1);
            } else {
                switch (bola) {
                    case 1:
                        System.out.println("BOLA AZUL");
                        break;
                    case 2:
                        System.out.println("BOLA ROJO");
                        break;
                    case 3:
                        System.out.println("BOLA BLANCO");
                        break;
                }
            }

        } while (bola == 4);

        return bola;
    }

}
