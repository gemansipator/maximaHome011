package user.electronics;

public class TvRemote extends ElectronicDevice{

    @Override
    public void start() {
        System.out.println("Распаковка пульта" + "\n"+ "\n");
    }

    @Override
    public void turnOff() {
        System.out.println("Выключение пульта");

    }

    @Override
    public int click(int button) {
        int number = button;

        if (number < 0 | number > 10){
            System.out.println("Вы вышли из диапазона кнопок пульта в выборе каналов. Введите число от 0 до 10");

        }else {

            switch (number) {
                case 0:
                    System.out.println("Вы включили внутренний канал провайдера");
                    break;
                case 1:
                    System.out.println("Вы включили канал № 1");
                    break;
                case 2:
                    System.out.println("Вы включили канал № 2");
                    break;
                case 3:
                    System.out.println("Вы включили канал № 3");
                    break;
                case 4:
                    System.out.println("Вы включили канал № 4");
                    break;
                case 5:
                    System.out.println("Вы включили канал № 5");
                    break;
                case 6:
                    System.out.println("Вы включили канал № 6");
                    break;
                case 7:
                    System.out.println("Вы включили канал № 7");
                    break;
                case 8:
                    System.out.println("Вы включили канал № 8");
                    break;
                case 9:
                    System.out.println("Вы включили канал № 9");
                    break;
                case 10:
                    System.out.println("Вы включили канал № 10");
                    break;
            }
        }




        return number;

    }

    @Override
    public void connect() {
        super.connect();
    }

    @Override
    public void connectDevice() {

    }
}
