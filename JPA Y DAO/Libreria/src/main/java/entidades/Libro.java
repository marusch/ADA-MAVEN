package entidades;

import javax.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @Column(name = "isbn")
    private long isbn;

    @Column(name = "titulo", length = 145, nullable = false)
    private String titulo;

    @Column(name = "anio", nullable = false)
    private Integer anio;

    @Column(name = "ejemplares", nullable = false)
    private Integer ejemplares;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    public Libro(long isbn, String titulo, Integer anio, Integer ejemplares,  Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.autor = autor;
    }

    public Libro() {
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }


}
