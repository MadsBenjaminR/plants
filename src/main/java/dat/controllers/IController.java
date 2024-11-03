package dat.controllers;

import io.javalin.http.Context;

public interface IController<T, D> {
    void create(Context ctx);
    void readAll(Context ctx);
    void read(Context ctx);
    void update(Context ctx);
    void delete(Context ctx);

    void readByType(Context context);
}
