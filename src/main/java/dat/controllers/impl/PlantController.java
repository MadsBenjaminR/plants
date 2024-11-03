package dat.controllers.impl;

import dat.controllers.IController;
import dat.daos.PlantDAO;
import dat.dtos.PlantDTO;
import io.javalin.http.Context;

public class PlantController implements IController<PlantDTO, Integer> {

    private PlantDAO plantDao;

    public PlantController(PlantDAO plantDao) {
        this.plantDao = plantDao;

    }


    @Override
    public void create(Context ctx) {

    }

    @Override
    public void readAll(Context ctx) {

    }

    @Override
    public void read(Context ctx) {

    }

    @Override
    public void update(Context ctx) {

    }

    @Override
    public void delete(Context ctx) {

    }
    @Override
    public void readByType(Context context) {
    }
}
