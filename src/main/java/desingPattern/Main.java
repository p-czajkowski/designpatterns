package desingPattern;

import desingPattern.strategy.Car;
import desingPattern.strategy.Credit;
import desingPattern.strategy.Leasing;
import desingPattern.strategy.Percent;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj kwotę do obliczenia: ");

        int carPrice = scanner.nextInt();

        Percent percentLeasing = new Leasing();

        Car car = new Car(BigDecimal.valueOf(carPrice));

        System.out.println("Cena samochodu w państwa konfiguracji: " + carPrice + "\n");

        Percent percentCredit = new Credit();

        System.out.println("Cena samochodu z odsetkami leasingu: " + car.calculatePrice(percentLeasing));
        System.out.println("Odsetki leasingu: "
                + car.calculatePrice(percentLeasing).subtract(BigDecimal.valueOf(carPrice)) + "\n");
        System.out.println("Cena samochodu z odsetkami kredytu: " + car.calculatePrice(percentCredit));
        System.out.println("Odsetki kredytu: "
                + car.calculatePrice(percentCredit).subtract(BigDecimal.valueOf(carPrice)) + "\n");

    }
}
