import electronics.control.ButtonPress;
import electronics.control.ConnectToASocket;
import electronics.control.SurgeProtectorPress;
import user.electronics.Monitor;
import user.electronics.SurgeProtector;
import user.electronics.TvBox;
import user.electronics.TvRemote;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Monitor monitor = new Monitor();
        SurgeProtector surgeProtector = new SurgeProtector();
        TvBox tvBox = new TvBox();
        TvRemote tvRemote = new TvRemote();

        surgeProtector.start();
        Scanner s = new Scanner(System.in);
        System.out.println("Введите 0 для включения сетевого фильтра");
        int SurgeProtectorClickOn = s.nextInt();
        surgeProtector.click(SurgeProtectorClickOn);
        System.out.println();
        surgeProtector.connectDevice();

        monitor.start();
        Scanner t = new Scanner(System.in);
        System.out.println("Введите 0 для включения монитора");
        int monitorClick = t.nextInt();
        monitor.click(monitorClick);

        System.out.println();


        tvBox.start();
        Scanner y = new Scanner(System.in);
        System.out.println("Введите 0 для включения TvBox");
        int tvBoxClick = y.nextInt();
        tvBox.click(tvBoxClick);
        System.out.println();

        tvRemote.start();
        Scanner u = new Scanner(System.in);
        System.out.println("Введите номер канала для пульта с 0 до 10: ");
        int goTV = u.nextInt();
        tvRemote.click(goTV);
        System.out.println();


        tvRemote.turnOff();
        monitor.turnOff();
        tvBox.turnOff();
        surgeProtector.turnOff();


    }
}