package boletin_31_2;

public interface IntegranteSeleccionFutbol{
    public void concentrarse();
    public void viajar();
    public void entrenar();
    public void jugarPartido();
    default void ruedaPrensa(){System.out.println("\t=> Realiza una rueda de prensa.");}
    default void videoPublicitario(){System.out.println("\t=> Realiza un video publicitario.");}
}