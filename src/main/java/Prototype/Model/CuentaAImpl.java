package Prototype.Model;

import Prototype.Interface.ICuenta;

public class CuentaAImpl implements ICuenta {

    private String tipo;
    private double monto;

    public CuentaAImpl() {
        tipo = "AHORRO";
    }

    public ICuenta clonar() {

        CuentaAImpl cuenta = null;

        try{
            cuenta = (CuentaAImpl) clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        return cuenta;

    }

    @Override
    public String toString() {
        return "CuentaAImpl{" + "tipo=" + tipo + ", monto=" + monto + "}";
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
