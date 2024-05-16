import entidad.*;
import service.*;
import dao.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de DAOs y servicios
        PacienteDAO pacienteDAO = new PacienteDAO();
        MedicoDAO medicoDAO = new MedicoDAO();
        TurnoDAO turnoDAO = new TurnoDAO();
        RecetaDAO recetaDAO = new RecetaDAO();
        ObraSocialDAO obraSocialDAO = new ObraSocialDAO();
        EspecialidadDAO especialidadDAO = new EspecialidadDAO();
        GestionTurnoService gestionTurnoService = GestionTurnoService.getInstance();
        AtencionMedicoService atencionMedicoService = AtencionMedicoService.getInstance();
        GestionFarmaciaService gestionFarmaciaService = GestionFarmaciaService.getInstance();
        Drogueria drogueria = Drogueria.getInstance();

        // Crear obras sociales
        ObraSocial obraSocial1 = new ObraSocial("ObraSocial1");
        ObraSocial obraSocial2 = new ObraSocial("ObraSocial2");
        obraSocialDAO.agregarObraSocial(obraSocial1);
        obraSocialDAO.agregarObraSocial(obraSocial2);

        // Crear médicos por obra social
        for (int i = 0; i < 4; i++) {
            Medico medico1 = new Medico("Dr. Pérez " + i, especialidadDAO.obtenerEspecialidades().get(0));
            Medico medico2 = new Medico("Dr. Gómez " + i, especialidadDAO.obtenerEspecialidades().get(1));
            medicoDAO.agregarMedico(medico1);
            medicoDAO.agregarMedico(medico2);
            obraSocialDAO.agregarMedico(obraSocial1, medico1);
            obraSocialDAO.agregarMedico(obraSocial2, medico2);
        }

        // Crear pacientes
        Paciente paciente1 = new Paciente("Juan", obraSocial1);
        Paciente paciente2 = new Paciente("María", obraSocial2);

        // Solicitar turnos para los pacientes
        Turno turno1 = gestionTurnoService.solicitarTurno(paciente1, obraSocialDAO.obtenerMedicosPorObraSocial(obraSocial1).get(0), "2024-05-01");
        Turno turno2 = gestionTurnoService.solicitarTurno(paciente2, obraSocialDAO.obtenerMedicosPorObraSocial(obraSocial2).get(0), "2024-05-02");

        List<Medicamento> medicamentosReceta1 = new ArrayList<>();
        medicamentosReceta1.add(drogueria.solicitarMedicamento("Medicamento1"));
        medicamentosReceta1.add(drogueria.solicitarMedicamento("Medicamento2"));
        atencionMedicoService.generarReceta(turno1, medicamentosReceta1);

        List<Medicamento> medicamentosReceta2 = new ArrayList<>();
        medicamentosReceta2.add(drogueria.solicitarMedicamento("Medicamento3"));
        medicamentosReceta2.add(drogueria.solicitarMedicamento("Medicamento4"));
        atencionMedicoService.generarReceta(turno2, medicamentosReceta2);

        // Verificar stock de medicamentos en la farmacia
        Medicamento medicamento1 = drogueria.solicitarMedicamento("Medicamento1");
        Medicamento medicamento3 = drogueria.solicitarMedicamento("Medicamento3");
        System.out.println("¿Medicamento1 en stock? " + gestionFarmaciaService.verificarStock(medicamento1));
        System.out.println("¿Medicamento3 en stock? " + gestionFarmaciaService.verificarStock(medicamento3));

        // Realizar pedido de medicamentos faltantes
        gestionFarmaciaService.realizarPedido(medicamento1, 100);
        gestionFarmaciaService.realizarPedido(medicamento3, 50);
    }
}