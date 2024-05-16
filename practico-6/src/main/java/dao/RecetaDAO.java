package dao;

import entidad.Receta;
import entidad.Turno;

import java.util.HashMap;
import java.util.Map;

public class RecetaDAO {
    private Map<Integer, Receta> recetas;

    public RecetaDAO() {
        this.recetas = new HashMap<>();
    }

    public void agregarReceta(Receta receta) {
        recetas.put(recetas.size() + 1, receta);
    }
}
