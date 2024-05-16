package dao;

import entidad.Especialidad;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class EspecialidadDAO {
    private Map<String, Especialidad> especialidades;

    public EspecialidadDAO() {
        this.especialidades = new HashMap<>();
    }

    public void agregarEspecialidad(Especialidad especialidad) {
        especialidades.put(especialidad.getNombre(), especialidad);
    }

    public Especialidad obtenerEspecialidadPorNombre(String nombre) {
        return especialidades.get(nombre);
    }

    public List<Especialidad> obtenerEspecialidades() {
        return new ArrayList<>(especialidades.values());
    }
}