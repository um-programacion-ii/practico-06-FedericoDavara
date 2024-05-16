package service;
import dao.*;
import entidad.*;
import java.util.ArrayList;
import java.util.List;

public class GestionTurnoService {
    private TurnoDAO turnoDAO;
    private List<Turno> turnos;


    private static GestionTurnoService instancia = new GestionTurnoService();

    private GestionTurnoService() {
        turnos = new ArrayList<>();
    }


    public static GestionTurnoService getInstance() {
        if (instancia == null) {
            instancia = new GestionTurnoService();
        }
        return instancia;
    }
    public void agregarTurno(Turno turno) {
        turnoDAO.agregarTurno(turno);
    }

    public List<Turno> obtenerTodosLosTurnos() {

        return null;
    }
    public Turno solicitarTurno(Paciente paciente, Medico medico, String fecha) {
        Turno turno = new Turno(paciente, medico, fecha);
        turnos.add(turno);
        return turno;
    }
}