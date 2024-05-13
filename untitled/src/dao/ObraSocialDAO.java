package dao;

import entidad.ObraSocial;

import java.util.HashMap;
import java.util.Map;

public class ObraSocialDAO {
    private Map<String, ObraSocial> obrasSociales;

    public ObraSocialDAO() {
        this.obrasSociales = new HashMap<>();
    }

    public void agregarObraSocial(ObraSocial obraSocial) {
        obrasSociales.put(obraSocial.getNombre(), obraSocial);
    }

    public ObraSocial obtenerObraSocialPorNombre(String nombre) {
        return obrasSociales.get(nombre);
    }
}