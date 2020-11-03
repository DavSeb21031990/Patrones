package Observer.Observer;

public class PesoMXObserver extends Observer {

    private double valorCambio = 19.07;

    public PesoMXObserver(Subject sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("MX: " + (sujeto.getEstado() * valorCambio));
    }

}
