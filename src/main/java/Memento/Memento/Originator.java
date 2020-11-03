package Memento.Memento;

import Memento.Model.Juego;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Originator {

    private Juego estado;

    public Memento guardar(){
        return new Memento(estado);
    }

    public void restaurar(Memento m){
        this.estado = m.getEstado();
    }

}
