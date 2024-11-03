package dat.routes;

import dat.security.routes.SecurityRoutes;
import io.javalin.apibuilder.EndpointGroup;
import jakarta.persistence.EntityManagerFactory;

import static io.javalin.apibuilder.ApiBuilder.path;

public class Routes {

    private final PlantRoutes plantRoutes;

    private final SecurityRoutes authRoute = new SecurityRoutes();

    public Routes(EntityManagerFactory emf){
        plantRoutes = new PlantRoutes(emf);
    }

    public EndpointGroup getRoutes() {
        return () -> {
            path("/plants", plantRoutes.getRoutes());
            path("/auth", authRoute.getSecurityRoutes());

         /*   //fordi vi finder users favorite spices og cuisines ghkjvhbkjblkjkibnkjn
            path("/users", favoriteRoute.getRoutes());
            path("/cuisines", cuisineRoute.getRoutes());


          */
        };
    }
}
