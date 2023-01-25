package user.electronics;

public class SurgeProtector extends ElectronicDevice{
    @Override
    public void start() {
        System.out.println("Распаковка и установка сетевого фильтра" + "\n"+ "\n");
    }

    @Override
    public void turnOff() {
        System.out.println("Выключение сетевого фильтра");

    }

    @Override
    public int click(int button) {
        int number = button;

        if (number < 0 | number > 0){
            System.out.println("Вы вышли из диапазона кнопок сетевого фильтра. Запустите программу сначала и введите число 0 (ноль)");

        }else {

            switch (number) {
                case 0:
                    System.out.println("Вы включили сетевой фильтр");
                    break;
            }
        }
        return number;

    }

    @Override
    public void connect() {
        System.out.println("Соединение сетевого фильтра с электропитанием розетки произошло");
    }

    @Override
    public void connectDevice() {
        System.out.println("Соединение сетевого фильтра с розеткой произошло"+ "\n");

    }
}
