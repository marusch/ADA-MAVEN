package servicios;

import entidades.Autor;
import persistencia.AutorDao;

import java.util.List;
import java.util.Scanner;

public class AutorServicio {

    Scanner entrada = new Scanner(System.in);
    private AutorDao autordao = new AutorDao();

    public void CrearAutor() throws Exception {

        Autor autor = new Autor();

        try {
            System.out.println("Ingrese el nombre del autor");
            String nombre = entrada.next();
            autor.setNombreAutor(nombre);

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe contener un nombre");
            } else {
                System.out.println("Se guardo exitosamente.");
            }
            autordao.Insertar(autor);

        } catch (Exception e) {
            throw e;
        }
    }

    public void MostrarAutorPorNombre() throws Exception {

        try {
            System.out.println("Ingrese el nombre del autor que desea buscar");
            String nombre = entrada.next();

            List<Autor> autor = autordao.ObtenerPorNombre(nombre);

            if (autor.isEmpty()) {
                throw new Exception("La lista de autores está vacía");
            } else {

                System.out.println("\n" + "Resultado: ");
                System.out.printf("%-10s%-20s\n", "Id", "Nombre");

                for (Autor autor1 : autor) {
                    System.out.printf("%-10s%-20s\n",autor1.getId(),
                            autor1.getNombreAutor());
                }
            }

        } catch (Exception e) {
            throw new Exception("No se encontro un autor con ese nombre");
        }

    }
}