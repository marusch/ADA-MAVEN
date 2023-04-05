package org.example;

public class Cliente {
    String nombre;
    float monto;

    public Cliente(String nombre, float monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public void depositar(float importe) {
        monto = monto + importe;
    }

    public void extraer(float importe) throws Exception {
        if (importe > monto)
            throw new Exception("No se puede extraer más dinero que el depositado.");
        monto = monto - importe;
    }

    public void imprimir() {
        System.out.println(nombre + " tiene " + monto);
    }
}
