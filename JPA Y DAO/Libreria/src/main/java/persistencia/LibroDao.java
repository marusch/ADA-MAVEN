package persistencia;

import entidades.Libro;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class LibroDao {

    private final EntityManager em = Persistence
            .createEntityManagerFactory("MiPersistence")
            .createEntityManager();


    public void Insertar(Libro libro) throws Exception {

        try {
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Error al cargar libro");
        }

    }

    public List<Libro> ObtenerTodos() throws Exception {

        try {

            List<Libro> libros = em.createQuery("SELECT a FROM Libro a", Libro.class)
                    .getResultList();
            return libros;

        } catch (Exception e) {
            throw new Exception("Error al buscar libros");
        }

    }

    public Libro ObtenerPorIsbn(Long isbn) throws Exception {

        try {
            Libro libro = em.find(Libro.class, isbn);
            return libro;
        } catch (Exception e) {
            throw new Exception("Error al buscar libro por isbn");
        }
    }


    public List<Libro> ObtenerPorTitulo(String titulo) throws Exception {

        try {

            List<Libro> libros = em.createQuery("SELECT a FROM Libro a WHERE a.titulo LIKE :t", Libro.class)
                    .setParameter("t", titulo)
                    .getResultList();
            return libros;

        } catch (Exception e) {
            throw new Exception("Error al buscar libro por titulo");
        }

    }



    public void Eliminar(Libro libro) throws Exception {

        try {

            em.getTransaction().begin();
            em.remove(libro);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Error al eliminar libro");
        }

    }
}
