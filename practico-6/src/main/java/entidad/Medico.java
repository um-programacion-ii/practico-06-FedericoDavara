package entidad;

public class Medico {
    private String nombre;
    private Especialidad especialidad;

    public Medico(String nombre, Especialidad especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void entregarReceta(Receta receta) {
        System.out.println("El médico " + this.nombre + " ha entregado la siguiente receta:");
        for (Medicamento medicamento : receta.getMedicamentos()) {
            System.out.println("- " + medicamento.getNombre());
        }
    }
}