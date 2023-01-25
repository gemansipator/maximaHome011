package electronics.control;

public interface MonitorButtonsPress extends ButtonPress, ConnectToASocket{  //Кнопки монитора



    @Override
    void connectDevice();
}
