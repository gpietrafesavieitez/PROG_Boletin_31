package boletin_31_3;

public class FutbolistaHM extends SeleccionFutbolHM implements IntegranteInterface, DeportistaInterface{
    private int dorsal;
    private String demarcacion;

    public FutbolistaHM(int id, int edad, String nombre, String apellidos, int dorsal, String demarcacion){
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    public void entrevista(){
        System.out.println("\t=> Realiza una entrevista.");
    }

    @Override
    public String toString(){
        return "Futbolista{" + super.toString() + ", dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }
}