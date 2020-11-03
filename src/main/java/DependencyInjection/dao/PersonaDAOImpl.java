package DependencyInjection.dao;

import DependencyInjection.Interface.IConexion;
import DependencyInjection.Interface.PersonaDAO;
import DependencyInjection.model.Persona;

import java.util.List;

public class PersonaDAOImpl implements PersonaDAO {

    private IConexion conexion;

    public void setConexion(IConexion conexion){
        this.conexion = conexion;
    }

    @Override
    public void mostrarNombre() {

    }

    @Override
    public List<Persona> listarTodos() {
        this.conexion.conectar();
        System.out.println("Listando...");
        return null;
    }

    @Override
    public Persona leerPorId(int id) {
        return null;
    }

    @Override
    public void registrar(Persona persona) {
        System.out.println("Persona " + persona.getNombres() + " registrado");
    }

    @Override
    public void actualizar(Persona persona) {
        System.out.println("Persona " + persona.getNombres() + " actualizado");
    }

    @Override
    public void eliminar(int id) {
        System.out.println("id " + id + " eliminado");
    }
}
