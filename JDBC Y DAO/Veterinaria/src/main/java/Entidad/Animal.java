package Entidad;

public class Animal {

    private Integer id;
    private String nombre;
    private Integer años;
    private String raza;

    public Animal(){
    }

    public Animal(Integer id, String nombre, Integer años, String raza) {
        this.id = id;
        this.nombre = nombre;
        this.años = años;
        this.raza = raza;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAños() {
        return años;
    }

    public void setAños(Integer años) {
        this.años = años;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return String.format("ANIMAL (id: %s, nombre: %s, años: %s, raza: %s)", id,
                nombre, años, raza);
    }
}
