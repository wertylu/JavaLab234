package milk.shop.iot;

public class MilkProduct {
    private String nameOfMilkProduct;
    private String origin;
    private double volumeOrMass;
    private double priceInUahPerKilo;
    private boolean homeMade;


    public MilkProduct() {

    }

    public MilkProduct(String nameOfMilkProduct, String origin, double volumeOrMass, double priceInUahPerKilo, boolean homeMade) {
        this.nameOfMilkProduct = nameOfMilkProduct;
        this.origin = origin;
        this.volumeOrMass = volumeOrMass;
        this.priceInUahPerKilo = priceInUahPerKilo;
        this.homeMade = homeMade;
    }

    public static String checkIfFactoryMade(boolean homeMade) {

        if (homeMade) {
            return "home made";
        } else {
            return "factory made";
        }
    }

    @Override
    public String toString() {
        String check = checkIfFactoryMade(this.homeMade);
        return "This milk product has the next parameters: " + "\nName: " + nameOfMilkProduct + "\nOrigin: "
                + origin + "\nThis product is " + check + "\nProduct`s mass: " + volumeOrMass + "\nPrice: " + priceInUahPerKilo;
    }


}
