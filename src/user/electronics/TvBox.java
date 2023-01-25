package user.electronics;

public class TvBox extends ElectronicDevice{
    @Override
    public void start() {
        System.out.println("Распаковка и установка TvBox" + "\n"+ "\n");

    }

    @Override
    public void turnOff() {
        System.out.println("Выключение TvBox");

    }

    @Override
    public int click(int button) {
        int number = button;

        if (number < 0 | number > 0){
            System.out.println("Вы вышли из диапазона кнопок TvBox. Запустите программу сначала и введите число 0 (ноль)");

        }else {

            switch (number) {
                case 0:
                    System.out.println("Вы включили TvBox");
                    break;
            }
        }
        return number;

    }

    @Override
    public void connect() {
        System.out.println("Соединение TvBox с электропитанием розетки произошло");
    }

    @Override
    public void connectDevice() {
        System.out.println("Соединение TvBox с монитором произошло"+ "\n");

    }
}
