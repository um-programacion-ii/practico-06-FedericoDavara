package service;

import entidad.*;

import java.util.List;

public class AtencionMedicoService {
    private static AtencionMedicoService instance;

    private AtencionMedicoService() {
    }

    public static AtencionMedicoService getInstance() {
        if (instance == null) {
            instance = new AtencionMedicoService();
        }
        return instance;
    }

    public void generarReceta(Turno turno, List<Medicamento> medicamentos) {
        if (turno != null && turno.getMedico() != null && turno.getPaciente() != null) {
            Medico medico = turno.getMedico();
            Receta receta = new Receta(turno, medicamentos);
            medico.entregarReceta(receta);
        }
    }
}
