package Decorator;

import Decorator.Decorator.BlindajeDecorador;
import Decorator.Interface.ICuentaBancaria;
import Decorator.InterfaceImpl.CuentaAhorro;
import Decorator.Model.Cuenta;

public class App {

    public static void main(String[] args) {

        Cuenta c = new Cuenta(1, "MitoCode");

        ICuentaBancaria cuenta = new CuentaAhorro();
        ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);

        cuentaBlindada.abrirCuenta(c);

    }

}
