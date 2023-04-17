package Servicios;

import entidades.Producto;
import persistencia.ProductoDAO;
import java.util.List;
import java.util.Scanner;

public class ProductoServicio {

    private ProductoDAO productoDAO = new ProductoDAO();

    public void mostrarProductos() throws Exception {

        try {
            List<Producto> productos = productoDAO.ObtenerProducto();

            if (productos.isEmpty()) {
                throw new Exception("La lista no tiene productos");

            } else {

                System.out.println( "\n" + "Lista de productos");
                System.out.printf("%-15s%-40s\n", "CODIGO", "Nombre");
                for (Producto producto : productos) {
                    System.out.printf("%-15s%-40s\n", producto.getCodigo(), producto.getNombre());

                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void MostrarPorNombreyPrecio() throws Exception {
        try {
            List<Producto> productos = productoDAO.ObtenerProducto();

            if (productos.isEmpty()) {
                throw new Exception("La lista no tiene productos");

            } else {

                System.out.println("\n" + "Lista de productos");
                System.out.printf("%-15s%-40s%-40s\n", "CODIGO", "Nombre", "Precio");
                for (Producto producto : productos) {
                    System.out.printf("%-15s%-40s%-40s\n", producto.getCodigo(),
                            producto.getNombre(), producto.getPrecio());

                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void MostrarProductoPrecio120y202() throws Exception {
        try {
            List<Producto> productos = productoDAO.ObtenerProductosPreciosEntre120y202();

            if (productos.isEmpty()) {
                throw new Exception("La lista no tiene productos");

            } else {

                System.out.println("\n" + "Lista de productos");
                System.out.printf("%-15s%-40s%-40s\n", "ID", "Nombre", "Precio");
                for (Producto producto : productos) {
                    System.out.printf("%-15s%-40s%-40s\n", producto.getCodigo(),
                            producto.getNombre(), producto.getPrecio());

                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void MostrarProductoPortatiles() throws Exception {
        try {
            List<Producto> productos = productoDAO.ObtenerPortatiles();

            if (productos.isEmpty()) {
                throw new Exception("La lista no tiene productos");

            } else {

                System.out.println("\n" + "Lista de productos");
                System.out.printf("%-15s%-40s%-40s%-20s\n", "ID", "Nombre", "Precio",
                        "Código Fabricante");
                for (Producto producto : productos) {
                    System.out.printf("%-15s%-40s%-40s%-20s\n", producto.getCodigo(),
                            producto.getNombre(), producto.getPrecio(), producto.getCodigo());

                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void MostrarProductoMenorPrecio() throws Exception {
        try {
            List<Producto> productos = productoDAO.ObtenerProductoDeMenorPrecio();

            if (productos.isEmpty()) {
                throw new Exception("La lista no tiene productos");

            } else {

                System.out.println("\n" + "Lista de productos");
                System.out.printf("%-40s%-40s\n", "Nombre", "Precio");
                for (Producto producto : productos) {
                    System.out.printf("%-40s%-40s\n", producto.getNombre(), producto.getPrecio());

                }
            }

        } catch (Exception e) {
            throw e;
        }
    }
}

