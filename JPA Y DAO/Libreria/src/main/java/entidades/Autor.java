package entidades;

import javax.persistence.*;

@Entity
@Table(name= "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column(name = "autor_nombre", length = 100, nullable = false)
    private String nombreAutor;

    public Autor(){

    }

    public Autor(Integer id, String nombreAutor) {
        Id = id;
        this.nombreAutor = nombreAutor;
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


}
