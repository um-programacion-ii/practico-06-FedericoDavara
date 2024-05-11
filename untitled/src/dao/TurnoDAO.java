package dao;

import entidad.Turno;
import java.util.ArrayList;
import java.util.List;

class TurnoDAO {
    private List<Turno> turnos = new ArrayList<>();

    public void agregarTurno(Turno turno) {
        turnos.add(turno);
    }

    public List<Turno> getTurnos() {
        return turnos;
    }
}
