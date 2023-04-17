package Servicios;

import java.util.Scanner;

public class MenuServicios {

    ProductoServicio productoServicios = new ProductoServicio();
    FabricanteServicio fabricanteServicios = new FabricanteServicio();

    Scanner entrada = new Scanner(System.in);

    public void Menu() throws Exception {
        try {
            System.out.println("\n" + "-----Menu-----\n"
                    + "a) Lista el nombre de todos los productos registrados.\n"
                    + "b) Lista los nombres y los precios de todos los productos registrados.\n"
                    + "c) Listar aquellos productos que su precio esté entre 120 y 202.\n"
                    + "d) Buscar y listar todos los Portátiles registradas.\n"
                    + "e) Listar el nombre y el precio del producto más barato.\n"
                    + "f) Listar el nombre y el codigo de los fabricantes registrados.\n"
                    + "g) Salir.");

            System.out.println("Seleccione una opción: ");
            String respuesta = entrada.next();
            OpcionSeleccionada(respuesta);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Debes ingresar una opcion valida");
        }

    }

    public void OpcionSeleccionada(String respuesta) throws Exception {
        try {
            switch (respuesta.toLowerCase()) {
                case "a":
                    productoServicios.mostrarProductos();
                    Menu();
                    break;
                case "b":
                    productoServicios.MostrarPorNombreyPrecio();
                    Menu();
                    break;
                case "c":
                    productoServicios.MostrarProductoPrecio120y202();
                    Menu();
                    break;
                case "d":
                    productoServicios.MostrarProductoPortatiles();
                    Menu();
                    break;
                case "e":
                    productoServicios.MostrarProductoMenorPrecio();
                    Menu();
                    break;
                case "f":
                    fabricanteServicios.mostrarFabricantes();
                    Menu();
                    break;
                case "g":
                    System.out.println("Consulta finalizada.");
                    break;
                default:

                    System.out.println("Ingrese una opcion valida");
                    Menu();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("No se pudo consultar las opciones");
        }
    }

}
