package org.example;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Fer", 10000);
        cliente1.imprimir();
        cliente1.depositar(2000);
        cliente1.imprimir();
        try {
            cliente1.extraer(5000);
            cliente1.imprimir();
            cliente1.extraer(3000);
            cliente1.imprimir();
            cliente1.extraer(70000);
            cliente1.imprimir();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}