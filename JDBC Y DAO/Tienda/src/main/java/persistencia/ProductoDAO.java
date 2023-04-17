package persistencia;

import entidades.Fabricante;
import entidades.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoDAO extends DAO{

    public List<Producto> ObtenerProducto() throws Exception {
        try {
            String sql = "SELECT * FROM producto P JOIN fabricante F " +
                    "ON P.codigo_fabricante = F.codigo;";

            QueryBD(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while (resultset.next()) {
                producto = new Producto();
                fabricante = new Fabricante();

                producto.setCodigo(resultset.getInt(1));
                producto.setNombre(resultset.getString(2));
                producto.setPrecio(resultset.getDouble(3));

                fabricante.setCodigo(resultset.getInt(1));
                fabricante.setNombre(resultset.getString(2));

                producto.setFabricante(fabricante);

                productos.add(producto);
            }

            return productos;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener producto");
        } finally {
            DesconectarBD();
        }
    }

    public List<Producto> ObtenerProductosPreciosEntre120y202() throws Exception {
        try {
            String sql = "SELECT * FROM producto P JOIN fabricante F " +
                    "ON P.codigo_fabricante = F.codigo WHERE precio >= 120 AND precio <=130;";

            QueryBD(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while (resultset.next()) {
                producto = new Producto();
                fabricante = new Fabricante();

                producto.setCodigo(resultset.getInt(1));
                producto.setNombre(resultset.getString(2));
                producto.setPrecio(resultset.getDouble(3));

                fabricante.setCodigo(resultset.getInt(1));
                fabricante.setNombre(resultset.getString(2));

                producto.setFabricante(fabricante);

                productos.add(producto);
            }

            return productos;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener productos");
        } finally {
            DesconectarBD();
        }
    }

    public List<Producto> ObtenerPortatiles() throws Exception {
        try {
            String sql = "SELECT * FROM producto INNER JOIN fabricante "
                    + "ON fabricante.codigo = producto.codigo_fabricante WHERE " +
                    "producto.nombre LIKE 'Portátil%'";

            QueryBD(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while (resultset.next()) {
                producto = new Producto();
                fabricante = new Fabricante();

                producto.setCodigo(resultset.getInt(1));
                producto.setNombre(resultset.getString(2));
                producto.setPrecio(resultset.getDouble(3));

                fabricante.setCodigo(resultset.getInt(1));
                fabricante.setNombre(resultset.getString(2));

                producto.setFabricante(fabricante);

                productos.add(producto);
            }

            return productos;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener portatiles");
        } finally {
            DesconectarBD();
        }
    }

    public List<Producto> ObtenerProductoDeMenorPrecio() throws Exception {
        try {
            String sql = "SELECT producto.nombre, MIN(producto.precio) FROM producto " +
                    "INNER JOIN fabricante ON fabricante.codigo = producto.codigo_fabricante";

            QueryBD(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto;
            Fabricante fabricante;

            while (resultset.next()) {
                producto = new Producto();
                fabricante = new Fabricante();

                producto.setNombre(resultset.getString(1));
                producto.setPrecio(resultset.getDouble(2));

                producto.setFabricante(fabricante);
                productos.add(producto);
            }

            return productos;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener el producto de menor precio");
        } finally {
            DesconectarBD();
        }
    }
}
