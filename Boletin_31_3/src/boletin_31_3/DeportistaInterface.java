package boletin_31_3;

public interface DeportistaInterface{
    
    default void entrenar(){
        System.out.println("\t=> Realiza un entrenamiento.");
    }
    
    default void jugarPartido(){
        System.out.println("\t=> Juega un partido.");
    }
}