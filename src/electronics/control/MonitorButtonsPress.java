package electronics.control;

public interface MonitorButtonsPress extends AbilityToPress, ConnectToASocket{  //Кнопки монитора



    @Override
    void connectDevice();
}
