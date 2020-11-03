package Decorator.Decorator;

import Decorator.Interface.ICuentaBancaria;
import Decorator.Model.Cuenta;

public class BlindajeDecorador extends CuentaDecorador {


    public BlindajeDecorador(ICuentaBancaria cuentaBancaria) {
        super(cuentaBancaria);
    }

    @Override
    public void abrirCuenta(Cuenta c) {
        cuentaBancaria.abrirCuenta(c);
        agregarBlindaje(c);
    }

    public void agregarBlindaje(Cuenta c){
        System.out.println("Se agregó blindaje a la cuenta del cliente " +
                c.getCliente());
    }

}
