package boletin_31_3;

public class EntrenadorHM extends SeleccionFutbolHM implements IntegranteInterface, DeportistaInterface{
    private int idFederacion;
    
    public EntrenadorHM(int id, int edad, String nombre, String apellidos, int idFederacion){
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idFederacion = idFederacion;
    }

    public void planificarEntrenamiento(){
        System.out.println("\t=> Planifica un entrenamiento.");
    }

    @Override
    public String toString(){
        return "Entrenador{" + super.toString() + ", idFederacion=" + idFederacion + '}';
    }
}