package dao;

import entidad.Paciente;
import java.util.HashMap;
import java.util.Map;

public class PacienteDAO {
    private Map<String, Paciente> pacientes;

    public PacienteDAO() {
        this.pacientes = new HashMap<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.put(paciente.getNombre(), paciente);
    }

    public Paciente obtenerPacientePorNombre(String nombre) {
        return pacientes.get(nombre);
    }

}
