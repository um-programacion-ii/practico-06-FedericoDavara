package service;

import entidad.Medicamento;
import java.util.List;
import java.util.ArrayList;

public class GestionFarmaciaService {
    private static GestionFarmaciaService instance;
    private List<Medicamento> stockFarmacia;

    private GestionFarmaciaService() {
        stockFarmacia = new ArrayList<>();
    }

    public static GestionFarmaciaService getInstance() {
        if (instance == null) {
            instance = new GestionFarmaciaService();
        }
        return instance;
    }

    public void agregarMedicamento(Medicamento medicamento) {
        stockFarmacia.add(medicamento);
    }

    public boolean verificarStock(Medicamento medicamento) {
        return stockFarmacia.contains(medicamento);
    }

    public void realizarPedido(Medicamento medicamento, int cantidad) {
        System.out.println("Realizando pedido a la droguería para " + cantidad + " unidades de " + medicamento.getNombre());
    }
}