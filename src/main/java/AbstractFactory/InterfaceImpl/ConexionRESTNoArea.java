package AbstractFactory.InterfaceImpl;

import AbstractFactory.Interface.IConexionREST;

public class ConexionRESTNoArea implements IConexionREST {

    public void leerURL(String url) {
        System.out.println("AREA NO ELEGIDA");
    }

}
