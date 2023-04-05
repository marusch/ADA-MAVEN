package Service;

import Entidad.Persona;
import Persistencia.PersonaDao;

import java.util.List;

public class PersonaServicio {
    private final PersonaDao personaDao;

    public PersonaServicio() {
        personaDao = new PersonaDao();
    }


    public void printPeople() throws Exception {
        try {
            List<Persona> persons = personaDao.getPeople();

            if (persons.isEmpty()) {
                throw new Exception("No existen personas");
            } else {
                System.out.println("LIST PEOPLE");
                System.out.printf("%-10s%-15s%-15s%-20s\n", "ID", "NOMBRE", "APELLIDO",
                        "EMAIL");
                for (Persona person : persons) {
                    System.out.printf("%-10s%-15s%-15s%-20s\n", person.getPersonId(),
                            person.getNombre(), person.getApellido(), person.getEmail());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
