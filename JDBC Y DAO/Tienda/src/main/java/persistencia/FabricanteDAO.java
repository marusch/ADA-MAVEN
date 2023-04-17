package persistencia;

import entidades.Fabricante;

import java.util.ArrayList;
import java.util.List;

public class FabricanteDAO extends DAO {

    public List<Fabricante> ObtenerFabricante() throws Exception {
        try {
            String sql = "SELECT * FROM fabricante";

            QueryBD(sql);

            List<Fabricante> fabricantes = new ArrayList<>();
            Fabricante fabricante;

            while (resultset.next()){
                fabricante = new Fabricante();
                fabricante.setCodigo(resultset.getInt(1));
                fabricante.setNombre(resultset.getString(2));

                fabricantes.add(fabricante);
            }

            return fabricantes;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener fabricante");
        } finally {
            DesconectarBD();
        }
    }

}
