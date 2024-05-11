package dao;

import entidad.ObraSocial;

import java.util.HashMap;
import java.util.Map;

class ObraSocialDAO {
    private Map<String, ObraSocial> obraSociales = new HashMap<>();

    public void agregarObraSocial(ObraSocial obraSocial) {
        obraSociales.put(obraSocial.getNombre(), obraSocial);
    }

    public ObraSocial buscarObraSocial(String nombre) {
        return obraSociales.get(nombre);
    }
}