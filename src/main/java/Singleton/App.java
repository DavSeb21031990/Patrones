package Singleton;

public class App {

    public static void main(String[] args) {

        Conexion c = Conexion.getInstancia();
        c.conectar();
        c.desconectar();

        boolean rpta = c instanceof Conexion;
        System.out.println(rpta);

    }

}
