package AbstractFactory;

import AbstractFactory.Interface.FactoryAbstract;
import AbstractFactory.Interface.IConexionDB;
import AbstractFactory.Interface.IConexionREST;
import AbstractFactory.InterfaceImpl.*;

public class ConexionRESTFactory implements FactoryAbstract {

    public IConexionDB getDB(String motor) {
        return null;
    }

    public IConexionREST getREST(String area) {
        if(area.equalsIgnoreCase("COMPRAS")){
            return new ConexionRESTCompras();
        }else if(area.equalsIgnoreCase("VENTAS")){
            return new ConexionRESTVentas();
        }else{
            return new ConexionRESTNoArea();
        }
    }

}
