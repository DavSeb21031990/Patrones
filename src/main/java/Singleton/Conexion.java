package Singleton;

public class Conexion {

    /*
    * Es una variable única para todas las instancias
    * (objetos) de la clase
    * */
    private static Conexion instancia;

    private Conexion(){

    }

    /*
    * El método estático en Java es un método que pertenece a la
    *  clase y no al objeto.
    *
    * Un método estático solo puede
    * acceder a datos estáticos.
    *
    * Un método estático puede llamar solo a otros métodos
    * estáticos y no puede invocar un método no estático a
    * partir de él
    * */
    public static Conexion getInstancia(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }

    public void conectar(){
        System.out.println("Me conecté a la 80");
    }

    public void desconectar(){
        System.out.println("Me desconectéde la 80");
    }
}
