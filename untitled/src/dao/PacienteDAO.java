package dao;

import entidad.Paciente;
import java.util.HashMap;
import java.util.Map;

class PacienteDAO {
    private Map<String, Paciente> pacientes = new HashMap<>();

    public void agregarPaciente(Paciente paciente) {
        pacientes.put(paciente.getNombre(), paciente);
    }

    public Paciente buscarPaciente(String nombre) {
        return pacientes.get(nombre);
    }
}
