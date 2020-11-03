package Decorator.Decorator;

import Decorator.Interface.ICuentaBancaria;
import Decorator.Model.Cuenta;

public abstract class CuentaDecorador implements ICuentaBancaria {

    protected ICuentaBancaria cuentaBancaria;

    public CuentaDecorador(ICuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public void abrirCuenta(Cuenta c) {
        this.cuentaBancaria.abrirCuenta(c);
    }
}
