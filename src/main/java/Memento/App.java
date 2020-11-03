package Memento;

import Memento.Memento.Caretaker;
import Memento.Memento.Originator;
import Memento.Model.Juego;

public class App {

    public static void main(String[] args) {

        String nombreJuego = "Crash Bandicoot";

        Juego juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpint(1);

        Caretaker caretaker = new Caretaker();
        //Guarda el estado del objeto
        Originator originator = new Originator();

        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpint(2);
        originator.setEstado(juego);

        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpint(3);
        originator.setEstado(juego);

        caretaker.addMemento(originator.guardar());

        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpint(4);

        originator.setEstado(juego);
        caretaker.addMemento(originator.guardar());

        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpint(5);
        originator.setEstado(juego);
        caretaker.addMemento(originator.guardar());

        originator.setEstado(juego);
        originator.restaurar(caretaker.getMemento(1));

        juego = originator.getEstado();
        System.out.println(juego);

    }

}
