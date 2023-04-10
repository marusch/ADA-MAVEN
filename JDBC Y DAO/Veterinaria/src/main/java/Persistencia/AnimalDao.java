package Persistencia;

import Entidad.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalDao extends Dao {

    public List<Animal> getAnimal() throws Exception {
        try {
            String sql = "SELECT * FROM informacion;";

            queryDatabase(sql);

            List<Animal> animals = new ArrayList<>();
            Animal animal;

            while (resultSet.next()) {
                animal = new Animal();

                animal.setId(resultSet.getInt(1));
                animal.setNombre(resultSet.getString(2));
                animal.setAños(resultSet.getInt(3));
                animal.setRaza(resultSet.getString(4));

                animals.add(animal);
            }

            return animals;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener los animales");
        } finally {
            disconnectDatabase();
        }
    }

}
