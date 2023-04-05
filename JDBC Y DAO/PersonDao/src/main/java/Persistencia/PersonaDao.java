package Persistencia;

import Entidad.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaDao extends Dao{

    public List<Persona> getPeople() throws Exception {
        try {
            String sql = "SELECT * FROM registros;";

            queryDatabase(sql);

            List<Persona> persons = new ArrayList<>();
            Persona person;

            while (resultSet.next()) {
                person = new Persona();

                person.setPersonId(resultSet.getInt(1));
                person.setNombre(resultSet.getString(2));
                person.setApellido(resultSet.getString(3));
                person.setEmail(resultSet.getString(4));

                persons.add(person);
            }

            return persons;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener personas");
        } finally {
            disconnectDatabase();
        }
    }

}
