package Factory.InterfaceImpl;

import Factory.Interface.IConexion;

public class ConexionMySQL implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionMySQL() {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contrasena = "123";
    }

    public void conectar() {
        System.out.println("Se conectó a Mysql");
    }

    public void desconectar() {
        System.out.println("Se desconectó de Mysql");
    }
}
