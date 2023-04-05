package Entidad;

public class Persona {
    private Integer personId;
    private String nombre;
    private String apellido;
    private String email;

    public Persona() {
    }

    public Persona(Integer personId, String nombre, String apellido, String email) {
        this.personId = personId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("PERSONA (id: %s, nombre: %s, apellido: %s, email: %s)",
                personId, nombre, apellido, email);
    }
}
