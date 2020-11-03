package Command.Command;

import Command.Interface.IOperacion;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<IOperacion> operaciones = new ArrayList<>();

    public void recibirOperacion(IOperacion operacion){
        this.operaciones.add(operacion);
    }

    public void realizarOperaciones(){
        this.operaciones.forEach(x -> x.execute());
        this.operaciones.clear();
    }

}
