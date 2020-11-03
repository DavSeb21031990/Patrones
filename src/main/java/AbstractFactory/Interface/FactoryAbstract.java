package AbstractFactory.Interface;

public interface FactoryAbstract {

    IConexionDB getDB(String motor);
    IConexionREST getREST(String area);

}
