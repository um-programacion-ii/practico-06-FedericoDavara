package dao;

import entidad.Medico;
import java.util.HashMap;
import java.util.Map;

public class MedicoDAO {
    private Map<String, Medico> medicos;

    public MedicoDAO() {
        this.medicos = new HashMap<>();
    }

    public void agregarMedico(Medico medico) {
        medicos.put(medico.getNombre(), medico);
    }

    public Medico obtenerMedicoPorNombre(String nombre) {
        return medicos.get(nombre);
    }
}
