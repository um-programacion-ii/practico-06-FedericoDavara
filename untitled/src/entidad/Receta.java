package entidad;
import java.util.List;

public class Receta {
    private List<Medicamento> medicamentos;

    public Receta(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    // Getters y setters
    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
}