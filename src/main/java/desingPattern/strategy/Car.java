package desingPattern.strategy;

import java.math.BigDecimal;

public class Car {

    /*
    wartość zmiennej przekazywanej do konstruktora
     */
    private BigDecimal price;

    /*
    publiczny konstruktor
    */
    public Car(BigDecimal price) {
        this.price = price;
    }

    /*
    metoda calculatePrice przyjmuje wartość o parametrze z interfejsu Percent, który tworzy strategię.
     */
    public BigDecimal calculatePrice(Percent percent) {
        return price.add(percent.calulcate(price));
    }
}
