package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class LibroDao {

    private final EntityManager em = Persistence
            .createEntityManagerFactory("MiPersistence")
            .createEntityManager();





}
