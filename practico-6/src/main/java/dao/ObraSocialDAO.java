package dao;

import entidad.Medico;
import entidad.ObraSocial;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class ObraSocialDAO {
    private Map<String, ObraSocial> obrasSociales;
    private Map<ObraSocial, List<Medico>> medicosPorObraSocial;

    public ObraSocialDAO() {
        this.obrasSociales = new HashMap<>();
        this.medicosPorObraSocial = new HashMap<>();
    }

    public void agregarObraSocial(ObraSocial obraSocial) {
        obrasSociales.put(obraSocial.getNombre(), obraSocial);
        medicosPorObraSocial.put(obraSocial, new ArrayList<>());
    }

    public ObraSocial obtenerObraSocialPorNombre(String nombre) {
        return obrasSociales.get(nombre);
    }

    public void agregarMedico(ObraSocial obraSocial, Medico medico) {
        List<Medico> medicos = medicosPorObraSocial.get(obraSocial);
        if (medicos != null) {
            medicos.add(medico);
        }
    }

    public List<Medico> obtenerMedicosPorObraSocial(ObraSocial obraSocial) {
        return medicosPorObraSocial.get(obraSocial);
    }
}