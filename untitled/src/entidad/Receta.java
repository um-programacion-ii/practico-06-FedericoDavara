package entidad;
import java.util.List;

public class Receta {
    private Turno turno;
    private List<Medicamento> medicamentos;

    public Receta(Turno turno, List<Medicamento> medicamentos) {
        this.turno = turno;
        this.medicamentos = medicamentos;
    }

    // Getters y setters
    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
}
