package persistencia;

import entidades.Autor;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class AutorDao {

    private final EntityManager em = Persistence
            .createEntityManagerFactory("MiPersistence")
            .createEntityManager();

    public void Insertar(Autor autor) throws Exception {

        try {
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Error al cargar autor");
        }
    }

    public List<Autor> ObtenerPorNombre(String nombre) throws Exception {

        try {
            return em.createQuery("SELECT a FROM Autor a WHERE a.nombreAutor LIKE :name", Autor.class)
                    .setParameter("name", nombre)
                    .getResultList();
        } catch (Exception e) {
            throw new Exception("Error al buscar autor por nombre");
        }
    }

    public Autor ObtenerPorId(Integer Id) throws Exception {

        try {
            Autor autor = em.find(Autor.class, Id);

            return autor;
        } catch (Exception e) {
            throw new Exception("Error al buscar autor por id");
        }
    }

    public List<Autor> ObtenerTodos() throws Exception {

        try {

            List<Autor> autores = em.createQuery("SELECT a FROM Autor a", Autor.class)
                    .getResultList();

            return autores;

        } catch (Exception e) {
            throw new Exception("Error al buscar autores");
        }
    }
}

