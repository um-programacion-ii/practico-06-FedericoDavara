package entidad;

public class Turno {
    private Paciente paciente;
    private Medico medico;
    private String fecha;

    public Turno(Paciente paciente, Medico medico, String fecha) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
    }

    // Getters y setters
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}