package org.example;

import Service.PersonaServicio;

public class Main {
    public static void main(String[] args) {

        PersonaServicio personService = new PersonaServicio();

        try {
            personService.printPeople();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}