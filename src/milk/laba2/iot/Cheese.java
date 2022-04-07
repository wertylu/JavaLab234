package milk.laba2.iot;

public class Cheese extends MilkProduct {
    private String typeOfCheese;
    private boolean slicedOrNot;

    public Cheese(String nameOfMilkProduct, String origin, double volumeOrMass, double priceInUahPerKilo, boolean homeMade, String typeOfCheese,  boolean slicedOrNot) {
        super(nameOfMilkProduct, origin, volumeOrMass, priceInUahPerKilo, homeMade);
        this.typeOfCheese = typeOfCheese;
        this.slicedOrNot = slicedOrNot;
    }
}