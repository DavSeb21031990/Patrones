package Proxy.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cuenta {

    private int idCuenta;
    private String usuario;
    private double saldoInicial;

    public Cuenta(int idCuenta, String usuario, double saldoInicial) {
        this.idCuenta = idCuenta;
        this.usuario = usuario;
        this.saldoInicial = saldoInicial;
    }

}
