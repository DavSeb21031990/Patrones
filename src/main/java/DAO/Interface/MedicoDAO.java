package DAO.Interface;

import DAO.model.Medico;

public interface MedicoDAO extends CRUD<Medico> {

    void curar();

}
