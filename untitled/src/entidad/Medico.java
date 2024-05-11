package entidad;

public class Medico {
    private String nombre;
    private Especialidad especialidad;
    private ObraSocial obraSocial; // Se agrega la obra social del médico
    private boolean atiendeParticular;

    public Medico(String nombre, Especialidad especialidad, ObraSocial obraSocial, boolean atiendeParticular) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.obraSocial = obraSocial;
        this.atiendeParticular = atiendeParticular;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }

    public boolean isAtiendeParticular() {
        return atiendeParticular;
    }

    public void setAtiendeParticular(boolean atiendeParticular) {
        this.atiendeParticular = atiendeParticular;
    }
}