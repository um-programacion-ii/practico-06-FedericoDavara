package dao;

import entidad.Receta;
import entidad.Turno;

import java.util.HashMap;
import java.util.Map;

class RecetaDAO {
    private Map<Turno, Receta> recetas = new HashMap<>();

    public void agregarReceta(Turno turno, Receta receta) {
        recetas.put(turno, receta);
    }

    public Receta buscarReceta(Turno turno) {
        return recetas.get(turno);
    }
}
