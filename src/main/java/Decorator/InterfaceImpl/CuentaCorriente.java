package Decorator.InterfaceImpl;

import Decorator.Interface.ICuentaBancaria;
import Decorator.Model.Cuenta;

public class CuentaCorriente implements ICuentaBancaria {

    public void abrirCuenta(Cuenta c) {
        System.out.println("-------------------------------------");
        System.out.println("Se abrió una Cuenta Corriente");
        System.out.println("Cliente: " + c.getCliente());
    }

}
