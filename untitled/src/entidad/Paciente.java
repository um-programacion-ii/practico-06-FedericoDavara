package entidad;

public class Paciente {
    private String nombre;
    private ObraSocial obraSocial;

    public Paciente(String nombre, ObraSocial obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }
}