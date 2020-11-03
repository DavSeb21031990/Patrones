package AbstractFactory;

import AbstractFactory.Interface.FactoryAbstract;
import AbstractFactory.Interface.IConexionDB;
import AbstractFactory.Interface.IConexionREST;
import AbstractFactory.InterfaceImpl.*;

public class ConexionAbstractFactory {

    public static FactoryAbstract getFactory(String tipoFactory){

        if(tipoFactory.equalsIgnoreCase("BD")){
            return new ConexionBDFactory();
        }else if(tipoFactory.equalsIgnoreCase("REST")){
            return new ConexionRESTFactory();
        }else{
            return null;
        }

    }

}
