package entidad;

public class Medico {
    private String nombre;
    private Especialidad especialidad;
    private boolean atiendeParticular;

    public Medico(String nombre, Especialidad especialidad, boolean atiendeParticular) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.atiendeParticular = atiendeParticular;
    }

    public String getNombre() {
        return nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public boolean isAtiendeParticular() {
        return atiendeParticular;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setAtiendeParticular(boolean atiendeParticular) {
        this.atiendeParticular = atiendeParticular;
    }
}
