package service;
import dao.*;
import entidad.*;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class GestionTurnoService {
    private TurnoDAO turnoDAO;

    private static final GestionTurnoService instancia = new GestionTurnoService();

    private GestionTurnoService() {
        this.turnoDAO = new TurnoDAO();
    }

    public static GestionTurnoService getInstancia() {
        return instancia;
    }

    public void agregarTurno(Turno turno) {
        turnoDAO.agregarTurno(turno);
    }

    public List<Turno> obtenerTodosLosTurnos() {

        return null;
    }

}