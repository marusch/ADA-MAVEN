package Servicio;

import Entidad.Animal;
import Persistencia.AnimalDao;

import java.util.List;

public class AnimalServicio{

    private final AnimalDao animalDao;

    public AnimalServicio() {
        animalDao = new AnimalDao();
    }


    public void printAnimal() throws Exception {

        try {
            List<Animal> animals = animalDao.getAnimal();

            if (animals.isEmpty()) {
                throw new Exception("No existen registros");
            } else {
                System.out.println("LIST ANIMALS");
                System.out.printf("%-10s%-15s%-15s%-20s\n","ID","NOMBRE", "AÑOS",
                        "RAZA");

                for (Animal animal : animals) {
                    System.out.printf("%-10s%-15s%-15s%-20s\n", animal.getId(),
                            animal.getNombre(), animal.getAños(), animal.getRaza());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
