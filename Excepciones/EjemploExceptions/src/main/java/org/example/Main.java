package org.example;

public class Main {
    public static void main(String[] ar) {

        try {
            PersonaAdulta persona1 = new PersonaAdulta("Ana", 50);
            persona1.imprimir();
            PersonaAdulta persona2 = new PersonaAdulta("Juan", 13);
            persona2.imprimir();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}