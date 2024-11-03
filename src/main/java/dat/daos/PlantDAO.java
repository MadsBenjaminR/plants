package dat.daos;

import jakarta.persistence.EntityManagerFactory;

public class PlantDAO {

    private static EntityManagerFactory emf;
    public PlantDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
}
