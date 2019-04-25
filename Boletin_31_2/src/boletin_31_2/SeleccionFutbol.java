package boletin_31_2;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    protected int id, edad;
    protected String nombre, apellidos;

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    @Override
    public String toString() {
        return "id=" + id + ", edad=" + edad + ", nombre=" + nombre + ", apellidos=" + apellidos;
    }
}