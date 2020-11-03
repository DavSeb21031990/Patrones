package Facade.Facade;

import Facade.API.AvionAPI;
import Facade.API.HotelAPI;

public class CheckFacade {

    private AvionAPI avionAPI;
    private HotelAPI hotelAPI;

    public CheckFacade() {
        this.avionAPI = new AvionAPI();
        this.hotelAPI = new HotelAPI();
    }

    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino){
        avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
        hotelAPI.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
    }

}
