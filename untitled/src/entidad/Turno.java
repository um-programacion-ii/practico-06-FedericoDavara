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

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public boolean isRecetaGenerada() {
        return recetaGenerada;
    }

    // Método para generar una receta para este turno
    public void generarReceta(List<Medicamento> medicamentos) {
        // Lógica para generar la receta con los medicamentos dados
        this.recetaGenerada = true;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setRecetaGenerada(boolean recetaGenerada) {
        this.recetaGenerada = recetaGenerada;
    }
}
