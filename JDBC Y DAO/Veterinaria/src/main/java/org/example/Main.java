package org.example;

import Servicio.AnimalServicio;

public class Main {
    public static void main(String[] args) {

        AnimalServicio animalServicio = new AnimalServicio();

        try {
            animalServicio.printAnimal();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
