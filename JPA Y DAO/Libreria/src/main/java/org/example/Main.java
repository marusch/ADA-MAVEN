package org.example;

import servicios.MenuServicios;

public class Main {
    public static void main(String[] args) {

        MenuServicios menuServicios = new MenuServicios();

        try{
            menuServicios.Menu();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}