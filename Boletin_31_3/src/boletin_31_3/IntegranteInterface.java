package boletin_31_3;

public interface IntegranteInterface{
    
    default void concentrarse(){
        System.out.println("\t=> Se concentra.");
    }
    
    default void viajar(){
        System.out.println("\t=> Realiza un viaje.");
    }
}