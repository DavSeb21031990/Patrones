package AbstractFactory;

import AbstractFactory.Interface.FactoryAbstract;
import AbstractFactory.Interface.IConexionDB;
import AbstractFactory.Interface.IConexionREST;

public class App {

    public static void main(String[] args) {

        FactoryAbstract factoryDB = ConexionAbstractFactory.getFactory("BD");
        IConexionDB cxBD1 = factoryDB.getDB("MYSQL");
        cxBD1.conectar();

        FactoryAbstract factoryREST = ConexionAbstractFactory.getFactory("REST");
        IConexionREST cxRS1 = factoryREST.getREST("COMPRAS");
        cxRS1.leerURL("https://www.youtube.com/watch?v=QmE-o5R7ZF4&list=PLvimn1Ins-41Uiugt1WbpyFo1XT1WOquL&index=4");

    }

}
