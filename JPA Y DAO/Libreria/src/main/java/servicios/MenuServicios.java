package servicios;

import java.util.Scanner;

public class MenuServicios {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    AutorServicio autorServicio = new AutorServicio();

    public void Menu() throws Exception {

        try {
            System.out.println("\n" + "-----MENU-----\n"
                    + "1) Registrar un Autor.\n"
                    + "2) Búsqueda de Autor por nombre.\n"
                    + "3) Búsqueda de Autor por Id o Código de registro.\n"
                    + "4) Lista de Autores registrados.\n"
                    + "5) Editar Autores registrados.\n"
                    + "6) Eliminar Autores registrados.\n"
                    + "7) Salir.");

            System.out.println("Seleccione una opcion: ");
            String respuesta = entrada.next();

            OpcionSeleccionada(respuesta);
        } catch (Exception e) {
            throw new Exception("Debe ingresar una opcion valida");
        }
    }

    public void OpcionSeleccionada(String respuesta) throws Exception {

        try {

            switch (respuesta) {

                case "1":
                    autorServicio.CrearAutor();
                    Menu();

                    break;

                case "2":
                    autorServicio.MostrarAutorPorNombre();
                    Menu();

                    break;

                case "3":
                   autorServicio.MostrarAutorPorId();
                    Menu();

                    break;

                case "4":
                    autorServicio.MostrarAutores();
                    Menu();

                    break;

                case "5":
                    autorServicio.EditarAutor();
                    Menu();

                    break;

                case "6":
                    autorServicio.EliminarRegistro();
                    Menu();

                    break;

                case "7":
                    System.out.println("Consulta finalizada.");
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
                    Menu();
            }

        } catch (Exception e) {
            throw new Exception();
        }
    }
}
