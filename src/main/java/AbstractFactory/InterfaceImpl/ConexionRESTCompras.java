package AbstractFactory.InterfaceImpl;

import AbstractFactory.Interface.IConexionREST;

public class ConexionRESTCompras implements IConexionREST {

    public void leerURL(String url) {
        System.out.println(url);
    }

}
