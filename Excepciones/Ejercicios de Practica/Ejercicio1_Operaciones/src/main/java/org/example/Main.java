package org.example;

public class Main {
    public static void main(String[] args) {

        Operaciones operaciones1=new Operaciones(10,0);
        operaciones1.sumar();
        operaciones1.restar();
        operaciones1.multiplicar();
        try {
            operaciones1.dividir();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}