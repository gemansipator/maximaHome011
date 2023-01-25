package electronics.control;

public interface SurgeProtectorPress extends ButtonPress, ConnectToASocket{ //сетевой фильтр




    @Override
    void connectDevice();
}
