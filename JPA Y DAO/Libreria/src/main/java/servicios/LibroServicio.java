package servicios;

import entidades.Autor;
import entidades.Libro;
import persistencia.LibroDao;

import java.util.List;
import java.util.Scanner;

public class LibroServicio {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    private LibroDao librodao = new LibroDao();

    public void CrearLibro() throws Exception {

        Libro libro = new Libro();
        Autor autor = new Autor();

        try {
            System.out.println("\n" + "Registro de Libros"+ "\n" + "Ingrese el ISBN: ");
            Long isbn = entrada.nextLong();

            libro.setIsbn(isbn);

            if (isbn == null || isbn.toString().trim().isEmpty()) {
                throw new Exception("El isbn es obligatorio");
            }

            System.out.println("Ingrese el titulo: ");
            String titulo = entrada.next();

            libro.setTitulo(titulo);

            if (titulo == null || titulo.toString().trim().isEmpty()) {
                throw new Exception("El titulo es obligatorio");
            }

            System.out.println("Ingrese el año: ");
            Integer anio = entrada.nextInt();
            libro.setAnio(anio);

            if (anio == null || anio.toString().trim().isEmpty()) {
                throw new Exception("El año es obligatorio");
            }

            System.out.println("Ingrese ejemplares: ");
            Integer ejemplares = entrada.nextInt();
            libro.setEjemplares(ejemplares);

            if (ejemplares == null || ejemplares.toString().trim().isEmpty()) {
                throw new Exception("Los ejemplares son obligatorio");
            }

            System.out.println("Ingrese el ID del Autor: ");
            Integer Id = entrada.nextInt();
            autor.setId(Id);

            libro.setAutor(autor);

            if (Id == null) {
                throw new Exception("El autor es obligatorio");
            }

            System.out.println("¡Registro Exitoso!");
            librodao.Insertar(libro);

        } catch (Exception e) {
            throw new Exception("Error al crear el libro");
        }
    }

    public void MostrarLibros() throws Exception {

        try {
            List<Libro> libros = librodao.ObtenerTodos();

            if (libros.isEmpty()) {
                throw new Exception("No hay registros de libros");

            } else {

                System.out.println("\n" + "Lista de Libros");
                System.out.printf("%-20s%-25s%-20s%-20s%-20s\n", "ISBN", "Titulo"
                        , "Autor", "Año", "Ejemplares");

                for (Libro libro : libros) {
                    System.out.printf("%-20s%-25s%-20s%-20s%-20s\n", libro.getIsbn(),
                            libro.getTitulo(), libro.getAutor().getNombreAutor(),
                            libro.getAnio(), libro.getEjemplares());
                }
            }
        }catch (Exception e) {
            throw e;
        }
    }


    public void MostrarLibroPorISBN() throws Exception {

        try {
            System.out.println("\n" + "Ingrese el ISBN del libro que desea buscar: ");
            Long isbn = entrada.nextLong();

            Libro libro = librodao.ObtenerPorIsbn(isbn);

            if (libro == null || isbn == null) {
                System.out.println("El libro no existe");
            } else {
                System.out.printf("%-20s%-25s%-20s%-20s%-20s\n", "ISBN", "Titulo"
                        , "Autor", "Año", "Ejemplares");

                System.out.printf("%-20s%-25s%-20s%-20s%-20s\n", libro.getIsbn(),
                        libro.getTitulo(), libro.getAutor().getNombreAutor(),
                        libro.getAnio(), libro.getEjemplares());
            }
        } catch (Exception e) {
            throw new Exception("Error al buscar libro por isbn");
        }
    }

    public void MostrarLibroPorTitulo() throws Exception {

        try {
            System.out.println("\n" + "Ingrese el titulo del libro que desea buscar: ");
            String titulo = entrada.next();

            List<Libro> libro = librodao.ObtenerPorTitulo(titulo);

            if (libro == null || titulo == null) {
                System.out.println("El libro no existe");
            } else {
                System.out.printf("%-20s%-25s%-20s%-20s%-20s\n", "ISBN", "Titulo"
                        , "Autor", "Año", "Ejemplares");

                for (Libro libro1 : libro) {
                    System.out.printf("%-20s%-25s%-20s%-20s%-20s\n", libro1.getIsbn(),
                            libro1.getTitulo(), libro1.getAutor().getNombreAutor(),
                            libro1.getAnio(), libro1.getEjemplares());
                }
            }
        } catch (Exception e) {
            throw new Exception("Error al buscar libro por titulo");
        }
    }

    public void MostrarLibroPorAutor() throws Exception {

        try {
            System.out.println("Ingrese el autor del libro que desea buscar");
            String autor = entrada.next();

            List<Libro> libro = librodao.ObtenerPorAutor(autor);

            if (libro == null || autor == null) {
                System.out.println("El libro no existe");
            } else {
                System.out.printf("%-20s%-35s%-20s%-20s%-20s\n", "ISBN", "Titulo"
                        , "Autor", "Año", "Ejemplares");

                for (Libro libro1 : libro) {
                    System.out.printf("%-20s%-35s%-20s%-20s%-20s\n", libro1.getIsbn(),
                            libro1.getTitulo(), libro1.getAutor().getNombreAutor(),
                            libro1.getAnio(), libro1.getEjemplares());
                }
            }

        } catch (Exception e) {
            throw new Exception("Error al buscar libro por autor");
        }

    }

    public void EditarLibro() throws Exception{

        try{

            System.out.println("Ingrese el isbn del libro que desea editar: ");
            Long isbn = entrada.nextLong();

            Libro libro = librodao.ObtenerPorIsbn(isbn);

            System.out.println("\n" + "Ingrese el nuevo nombre del libro:");
            String titulo = entrada.next();

            libro.setTitulo(titulo);

            System.out.println("\n" + "Ingrese el año nuevamente del libro:");
            Integer anio = entrada.nextInt();

            libro.setAnio(anio);

            System.out.println("\n" + "Ingrese la cantidad de ejemplares nuevamente del libro:");
            Integer ejemplares = entrada.nextInt();

            libro.setEjemplares(ejemplares);

            System.out.println("\n" + "¡Se edito exitosamente!");
            librodao.Actualizar(libro);

        }catch (Exception e) {
            throw new Exception("No se encontro un libro con ese ISBN ");
        }
    }


    public void EliminarRegistro() throws Exception{
        try{

            System.out.println("\n" + "Ingrese el ISBN del libro que desea eliminar: ");
            Long isbn = entrada.nextLong();

            Libro libro = librodao.ObtenerPorIsbn(isbn);

            System.out.println("\n" + "¡Se elimino exitosamente!");
            librodao.Eliminar(libro);

        }catch (Exception e){
            throw new Exception("No se encontro un libro con ese ISBN ");
        }
    }


}
