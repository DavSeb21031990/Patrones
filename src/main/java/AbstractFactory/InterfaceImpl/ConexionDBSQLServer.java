package AbstractFactory.InterfaceImpl;

import AbstractFactory.Interface.IConexionDB;

public class ConexionDBSQLServer implements IConexionDB {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionDBSQLServer() {
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "admin";
        this.contrasena = "123";
    }

    public void conectar() {
        System.out.println("Se conectó a SQLServer");
    }

    public void desconectar() {
        System.out.println("Se desconectó de SQLServer");
    }

}
