package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Scanner keyboard = new Scanner(System.in);
        int base;

        System.out.print("Ingrese un valor entero:");
        base = keyboard.nextInt();
        int square = base * base;
        System.out.print("El cuadrado de " + base + " es " + square);
*/

        //Try catch
        Scanner keyboard = new Scanner(System.in);
        int base;
        try {
            System.out.print("Ingrese un valor entero: ");
            base = keyboard.nextInt();
            int square = base * base;
            System.out.print("El cuadrado de " + base + " es " + square);
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un número entero.");
        } finally {
            System.out.println("Fin del proceso");
        }


    }
}