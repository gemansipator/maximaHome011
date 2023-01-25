package user.electronics;

import electronics.control.ButtonPress;
import electronics.control.ConnectToASocket;

public class Monitor extends ElectronicDevice{

    @Override
    public void start() {
        System.out.println("Распаковка и установка монитора" + "\n"+ "\n");

    }

    @Override
    public void turnOff() {
        System.out.println("Выключение монитора");

    }

    @Override
    public int click(int button) {
        int number = button;

        if (number < 0 | number > 0){
            System.out.println("Вы вышли из диапазона кнопок монитора. Запустите программу сначала и введите число 0 (ноль)");

        }else {

            switch (number) {
                case 0:
                    System.out.println("Вы включили монитор");
                    break;
            }
        }
        return number;

    }

    @Override
    public void connect() {
        System.out.println("Соединение монитора с электропитанием произошло");
    }

    @Override
    public void connectDevice() {
        System.out.println("Соединение монитора с TvBox произошло"+ "\n");

    }
}
