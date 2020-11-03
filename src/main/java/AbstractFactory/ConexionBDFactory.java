package AbstractFactory;

import AbstractFactory.Interface.FactoryAbstract;
import AbstractFactory.Interface.IConexionDB;
import AbstractFactory.Interface.IConexionREST;
import AbstractFactory.InterfaceImpl.*;

public class ConexionBDFactory implements FactoryAbstract {

    public IConexionDB getDB(String motor) {

        if(motor.equalsIgnoreCase("MYSQL")){
            return new ConexionDBMySQL();
        }else if(motor.equalsIgnoreCase("ORACLE")){
            return new ConexionDBOracle();
        }else if(motor.equalsIgnoreCase("POSTGRES")){
            return new ConexionDBPosgreSQL();
        }else if(motor.equalsIgnoreCase("SQLSERVER")){
            return new ConexionDBSQLServer();
        }else{
            return new ConexionDBVacia();
        }

    }

    public IConexionREST getREST(String area) {
        return null;
    }
}
