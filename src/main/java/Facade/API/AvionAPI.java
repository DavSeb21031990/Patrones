package Facade.API;

public class AvionAPI {

    public void buscarVuelos(String fechaIda, String fechaVuelta,
                             String origen, String destino){
        System.out.println("------------------------------------");
        System.out.println("Vuelos encontrados para " + destino +
                " desde " + destino);
        System.out.println("Fecha Ida: " + fechaIda + " Fecha Vuelta "
        + fechaVuelta);
        System.out.println("------------------------------------");
    }

}
