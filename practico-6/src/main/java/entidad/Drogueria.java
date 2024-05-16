package entidad;

import java.util.HashMap;
import java.util.Map;

public class Drogueria {
    private static Drogueria instance;
    private Map<String, Medicamento> stock;

    private Drogueria() {
        stock = new HashMap<>();
    }

    public static Drogueria getInstance() {
        if (instance == null) {
            instance = new Drogueria();
        }
        return instance;
    }

    public Medicamento solicitarMedicamento(String nombreMedicamento) {
        Medicamento medicamento = stock.get(nombreMedicamento);
        if (medicamento == null) {
            medicamento = new Medicamento(nombreMedicamento);
            stock.put(nombreMedicamento, medicamento);
        }
        return medicamento;
    }
}