package Prototype;

import Prototype.Model.CuentaAImpl;

public class App {

    public static void main(String[] args) {

        CuentaAImpl cuentaAhorro = new CuentaAImpl();
        cuentaAhorro.setMonto(200);

        CuentaAImpl cuentaClonada = (CuentaAImpl) cuentaAhorro.clonar();

        if(cuentaClonada != null){
            System.out.println(cuentaClonada);
        }

        System.out.println(cuentaClonada == cuentaAhorro);

    }

}
