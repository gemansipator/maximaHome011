package electronics.control;

public interface ConnectToASocket { //подключить к розетке

    default void connect(){
        System.out.println("Соединение с розеткой произошло");
    }
    void connectDevice();
}
