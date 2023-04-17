package entidades;

public class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    private Fabricante fabricante;

    public Producto(int codigo, String nombre, double precio, Fabricante fabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.fabricante = fabricante;
    }

    public Producto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }


    @Override
    public String toString() {
        return String.format("Tienda (id: %s, nombre: %s, apellido: %s, precio: %s)",
                codigo, nombre, precio, fabricante);
    }
}
