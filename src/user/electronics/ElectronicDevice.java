package user.electronics;

import electronics.control.AbilityToPress;
import electronics.control.ConnectToASocket;

public abstract class ElectronicDevice implements AbilityToPress, ConnectToASocket {

    abstract void start();
    abstract void turnOff();
    @Override
    public int click(int button) {
        return 0;
    }

    @Override
    public void connect() {
        ConnectToASocket.super.connect();
    }

    @Override
    public void connectDevice() {

    }
}
