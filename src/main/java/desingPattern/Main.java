package desingPattern;

import desingPattern.builder.Body;
import desingPattern.builder.CarBuilder;
import desingPattern.builder.Color;
import desingPattern.singleton.CarPrice;
import desingPattern.strategy.Car;
import desingPattern.strategy.Credit;
import desingPattern.strategy.Leasing;
import desingPattern.strategy.Percent;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CarPrice carPriceSingleton = CarPrice.INSTANCE;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę do obliczenia twojej konfiguracji: ");
        int carPrice = scanner.nextInt();

        clientsConfigurationPrice(carPrice);

    }

    public static void clientsConfigurationPrice(int carPrice){
        Car car = new Car(BigDecimal.valueOf(carPrice));

        Percent percentLeasing = new Leasing();
        Percent percentCredit = new Credit();

        System.out.println("Cena samochodu w państwa konfiguracji: " + carPrice + "\n");
        System.out.println("Cena samochodu z odsetkami leasingu: " + car.calculatePrice(percentLeasing));
        System.out.println("Odsetki leasingu: "
                + car.calculatePrice(percentLeasing).subtract(BigDecimal.valueOf(carPrice)) + "\n");
        System.out.println("Cena samochodu z odsetkami kredytu: " + car.calculatePrice(percentCredit));
        System.out.println("Odsetki kredytu: "
                + car.calculatePrice(percentCredit).subtract(BigDecimal.valueOf(carPrice)) + "\n");
    }

    public static void clientCarConfiguration(){
        CarBuilder carBuilder = CarBuilder.builder()
                .body(Body.ESTATE)
                .color(Color.DESIRE_RED)
                .engineCapacity(1400)
                .enginePower(125)
                .build();
        System.out.println(carBuilder);
    }
}
