package boletin_31_3;

public class MasajistaHM extends SeleccionFutbolHM implements IntegranteInterface{
    private int aniosExperencia;
    private String titulacion;
    
    public MasajistaHM(int id, int edad, String nombre, String apellidos, int aniosExperencia, String titulacion){
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.aniosExperencia = aniosExperencia;
        this.titulacion = titulacion;
    }

    public void darMasaje(){
        System.out.println("\t=> Realiza un masaje.");
    }

    @Override
    public String toString(){
        return "Masajista{" + super.toString() + ", aniosExperencia=" + aniosExperencia + ", titulacion=" + titulacion + '}';
    }
}