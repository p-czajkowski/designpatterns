package desingPattern.singleton;

/*Singleton*/
public class CarPrice {

    public int price = 63900;

    public static final CarPrice INSTANCE = new CarPrice();

    private CarPrice(){
        System.out.println("Cena bazowego modelu: " + price);
    }

    @Override
    public String toString() {
        return "CarPrice{" +
                "price=" + price +
                '}';
    }
}
