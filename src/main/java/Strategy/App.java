package Strategy;

import Strategy.Interface.Impl.AntivirusAvanzado;
import Strategy.Strategy.Contexto;

public class App {

    public static void main(String[] args) {

        Contexto contexto = new Contexto(new AntivirusAvanzado());
        contexto.ejecutar();

    }

}
