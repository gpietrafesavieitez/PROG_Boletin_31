package boletin_31_3;

import java.util.ArrayList;

public class Aplicacion{
    
    public static void main(String[] args){
        FutbolistaHM f = new FutbolistaHM(1,30,"Cristiano","Ronaldo",7,"delantero");
        System.out.println(f.toString());
        f.concentrarse();
        f.viajar();
        f.entrenar();
        f.jugarPartido();
        f.entrevista();
        EntrenadorHM e = new EntrenadorHM(2,60,"Vicente","Del Bosque",12345);
        System.out.println(e.toString());
        e.concentrarse();
        e.viajar();
        e.entrenar();
        e.jugarPartido();
        e.planificarEntrenamiento();
        MasajistaHM m = new MasajistaHM(3,22,"Pepe","Botella",4,"Fisioterapeuta");
        System.out.println(m.toString());
        m.concentrarse();
        m.viajar();
        m.darMasaje();
        ArrayList<SeleccionFutbolHM> lista = new ArrayList<>();
        lista.add(f);
        lista.add(e);
        lista.add(m);
        System.out.println("Lista de jugadores:");
        for(SeleccionFutbolHM jugador : lista){
            System.out.println("\t- " + jugador.toString());
        }
    }
}