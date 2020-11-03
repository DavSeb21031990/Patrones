package Observer.Observer;

public class SolObserver extends Observer {

    private double valorCambio = 3.25;

    public SolObserver(Subject sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("PEN: " + (sujeto.getEstado() * valorCambio));
    }

}
