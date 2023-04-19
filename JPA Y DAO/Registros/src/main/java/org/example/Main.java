package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MiUnidadDePersistencia");


        // Obtener una instancia de EntityManager desde el EntityManagerFactory
        EntityManager entityManager = emf.createEntityManager();

        // Iniciar una transacción
        entityManager.getTransaction().begin();

        // Crear una nueva instancia de Usuario y establecer sus propiedades
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setApellido("Pérez");
        usuario.setCorreoElectronico("juan.perez@example.com");

        // Persistir el usuario en la base de datos
        entityManager.persist(usuario);

        // Confirmar la transacción
        entityManager.getTransaction().commit();

        // Cerrar el EntityManager
        entityManager.close();


    }
}
