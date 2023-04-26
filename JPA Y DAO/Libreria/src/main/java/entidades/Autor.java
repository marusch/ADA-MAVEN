package entidades;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "autor_nombre", length = 100, nullable = false)
    private String nombreAutor;

    @OneToMany(mappedBy = "autor")
    private List<Libro> libros;

    public Autor(){

    }

    public Autor(Integer id, String nombreAutor, List<Libro> libros) {
        Id = id;
        this.nombreAutor = nombreAutor;
        this.libros = libros;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
