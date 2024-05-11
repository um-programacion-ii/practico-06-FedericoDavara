package entidad;
import java.util.List;

public class Turno {
    private Paciente paciente;
    private Medico medico;
    private boolean recetaGenerada;

    public Turno(Paciente paciente, Medico medico) {
        this.paciente = paciente;
        this.medico = medico;
        this.recetaGenerada = false;
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

    public boolean isRecetaGenerada() {
        return recetaGenerada;
    }

    public void setRecetaGenerada(boolean recetaGenerada) {
        this.recetaGenerada = recetaGenerada;
    }
}