package dao;

import entidad.Turno;
import java.util.HashMap;
import java.util.Map;

public class TurnoDAO {
    private Map<Integer, Turno> turnos;

    public TurnoDAO() {
        this.turnos = new HashMap<>();
    }

    public void agregarTurno(Turno turno) {
        turnos.put(turnos.size() + 1, turno);
    }
}
