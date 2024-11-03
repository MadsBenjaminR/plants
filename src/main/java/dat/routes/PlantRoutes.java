package dat.routes;

import dat.controllers.impl.PlantController;
import dat.daos.PlantDAO;
import dat.security.enums.Role;
import io.javalin.apibuilder.EndpointGroup;
import jakarta.persistence.EntityManagerFactory;

import static io.javalin.apibuilder.ApiBuilder.*;
import static io.javalin.apibuilder.ApiBuilder.delete;

public class PlantRoutes {

    private PlantController plantController;

    public PlantRoutes(EntityManagerFactory emf) {
        plantController = new PlantController(new PlantDAO(emf));
    }

    protected EndpointGroup getRoutes() {

        return () -> {
            post("/plant", plantController::create);
            get("/", plantController::readAll);
            get("/plant/{id}", plantController::read);
            get("/plant/type/{type}", plantController::readByType);

            put("/plant/{id}", plantController::update);
            delete("/plant/{id}", plantController::delete);
        };
    }
}
