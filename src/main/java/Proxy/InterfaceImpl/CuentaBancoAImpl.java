package Proxy.InterfaceImpl;

import Proxy.Interface.ICuenta;
import Proxy.Model.Cuenta;

public class CuentaBancoAImpl implements ICuenta {

    public CuentaBancoAImpl() {
    }

    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        double saldoActual = cuenta.getSaldoInicial() - monto;
        cuenta.setSaldoInicial(saldoActual);
        System.out.println("Saldo Actual: " + cuenta.getSaldoInicial());
        return cuenta;
    }

    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        double saldoActual = cuenta.getSaldoInicial() + monto;
        cuenta.setSaldoInicial(saldoActual);
        System.out.println("Saldo Actual: " + cuenta.getSaldoInicial());
        return cuenta;
    }

    public void mostrarSaldo(Cuenta cuenta) {
        System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
    }
}
