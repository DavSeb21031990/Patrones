package Factory;

import Factory.Interface.IConexion;
import Factory.InterfaceImpl.*;

public class ConexionFactory {

    public IConexion getConexion(String motor){

        if(motor.equalsIgnoreCase("MYSQL")){
            return new ConexionMySQL();
        }else if(motor.equalsIgnoreCase("ORACLE")){
            return new ConexionOracle();
        }else if(motor.equalsIgnoreCase("POSTGRES")){
            return new ConexionPosgreSQL();
        }else if(motor.equalsIgnoreCase("SQLSERVER")){
            return new ConexionSQLServer();
        }else{
            return new ConexionVacia();
        }

    }

}
