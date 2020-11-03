package Strategy.Interface.Impl;

import Strategy.Interface.IEstrategia;

public abstract class AnalisisSimple implements IEstrategia {

    public void analizar(){
        iniciar();
        saltarZip();
        detener();
    }

    abstract void detener();

    abstract void saltarZip();

    abstract void iniciar();

}
