package boletin_31_1;

import java.util.ArrayList;

public class Aplicacion{
    
    public static void main(String[] args){
        ArrayList<SeleccionFutbol> lista = new ArrayList<>();
        lista.add(new Futbolista(1,30,"Cristiano","Ronaldo",7,"delantero"));
        lista.add(new Entrenador(2,60,"Vicente","Del Bosque",12345));
        lista.add(new Masajista(3,22,"Pepe","Botella",4,"Fisioterapeuta"));
        System.out.println("Lista de jugadores:");
        for(SeleccionFutbol jugador : lista){
            System.out.println("\t- " + jugador.toString());
        }
    }
}