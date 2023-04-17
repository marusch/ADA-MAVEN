package org.example;

import Servicios.MenuServicios;

public class Main {
    public static void main(String[] args) {

        MenuServicios servicios = new MenuServicios();

        try {
            servicios.Menu();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}