package dao;

import entidad.Especialidad;

import java.util.HashMap;
import java.util.Map;

class EspecialidadDAO {
    private Map<String, Especialidad> especialidades = new HashMap<>();

    public void agregarEspecialidad(Especialidad especialidad) {
        especialidades.put(especialidad.getNombre(), especialidad);
    }

    public Especialidad buscarEspecialidad(String nombre) {
        return especialidades.get(nombre);
    }
}