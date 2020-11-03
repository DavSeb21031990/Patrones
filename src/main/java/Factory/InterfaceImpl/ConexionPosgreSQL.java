package Factory.InterfaceImpl;

import Factory.Interface.IConexion;

public class ConexionPosgreSQL implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionPosgreSQL() {
        this.host = "localhost";
        this.puerto = "1433";
        this.usuario = "postgres";
        this.contrasena = "123";
    }

    public void conectar() {
        System.out.println("Se conectó a PosgreSQL");
    }

    public void desconectar() {
        System.out.println("Se desconectó de PosgreSQL");
    }

}
