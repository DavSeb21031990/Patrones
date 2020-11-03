package AbstractFactory.InterfaceImpl;

import AbstractFactory.Interface.IConexionDB;

public class ConexionDBVacia implements IConexionDB {

    public void conectar() {
        System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
    }

    public void desconectar() {
        System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
    }

}
