package DAO.Interface;

import DAO.model.Persona;

public interface PersonaDAO extends CRUD<Persona> {

    void mostrarNombre();

}
