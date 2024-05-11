package dao;

import entidad.Especialidad;
import entidad.Medico;
import entidad.ObraSocial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MedicoDAO {
    private Map<String, Medico> medicos = new HashMap<>();

    public void agregarMedico(Medico medico) {
        medicos.put(medico.getNombre(), medico);
    }

    public Medico buscarMedico(String nombre) {
        return medicos.get(nombre);
    }

    public List<Medico> listarMedicos() {
        return new ArrayList<>(medicos.values());
    }

    public List<Medico> listarMedicosPorEspecialidadYObraSocial(Especialidad especialidad, ObraSocial obraSocial) {
        List<Medico> medicosFiltrados = new ArrayList<>();
        for (Medico medico : medicos.values()) {
            if (medico.getEspecialidad().equals(especialidad) && medico.getObraSocial().equals(obraSocial)) {
                medicosFiltrados.add(medico);
            }
        }
        return medicosFiltrados;
    }
}
