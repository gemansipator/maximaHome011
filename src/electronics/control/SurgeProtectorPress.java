package electronics.control;

public interface SurgeProtectorPress extends AbilityToPress, ConnectToASocket{ //сетевой фильтр




    @Override
    void connectDevice();
}
