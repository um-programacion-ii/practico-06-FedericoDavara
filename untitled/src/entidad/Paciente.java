package entidad;

public class Paciente {
    private String nombre;
    private ObraSocial obraSocial;

    public Paciente(String nombre, ObraSocial obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }
}