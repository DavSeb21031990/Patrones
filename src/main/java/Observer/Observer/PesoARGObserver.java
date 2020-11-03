package Observer.Observer;

public class PesoARGObserver extends Observer {

    private double valorCambio = 29.86;

    public PesoARGObserver(Subject sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("ARG: " + (sujeto.getEstado() * valorCambio));
    }
}
