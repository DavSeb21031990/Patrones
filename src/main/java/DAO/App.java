package DAO;

import DAO.Interface.CRUD;
import DAO.dao.PersonaDAOImpl;
import DAO.model.Persona;

public class App {

    public static void main(String[] args) {

        CRUD<Persona> dao = new PersonaDAOImpl();
        dao.listarTodos().forEach(x -> System.out.println(x.getNombre()));

        Persona per = new Persona();
        per.setNombre("MitoCode");
        dao.registrar(per);

    }

}
