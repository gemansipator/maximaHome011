package electronics.control;

public interface TvRemotePress extends ButtonPress{  // ТВ пульт

    @Override
    default void click() {
        ButtonPress.super.click();
    }
}
