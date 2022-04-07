package milk.shop.iot;

public class Milk extends MilkProduct{
    private double percentageOfFat;
    private boolean lactoseFree;

    public Milk(String nameOfMilkProduct, String origin, double volumeOrMass, double priceInUahPerKilo, boolean homeMade, double percentageOfFat, boolean lactoseFree) {
        super(nameOfMilkProduct, origin, volumeOrMass, priceInUahPerKilo, homeMade);

        this.percentageOfFat = percentageOfFat;
        this.lactoseFree = lactoseFree;

    }
}