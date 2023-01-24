package electronics.control;

public interface SurgeProtectorPress extends ButtonPress, ConnectToASocket{ //сетевой фильтр


    @Override
    default void click() {
        ButtonPress.super.click();
    }
}
