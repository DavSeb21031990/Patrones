package Observer;

import Observer.Observer.PesoARGObserver;
import Observer.Observer.PesoMXObserver;
import Observer.Observer.SolObserver;
import Observer.Observer.Subject;

public class App {

    public static void main(String[] args) {

        Subject subject = new Subject();

        new SolObserver(subject);
        new PesoARGObserver(subject);
        new PesoMXObserver(subject);

        System.out.println("Si desea cambiar 10 dólares obtendrá: ");
        subject.setEstado(10);
        System.out.println("--------------------------------------");
        System.out.println("Si desea cambiar 100 dólares obtendrá: ");
        subject.setEstado(100);

    }

}
