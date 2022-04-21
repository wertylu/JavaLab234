package milk.lab3.iot;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class MilkProduct {
     private String nameOfMilkProduct;
     private String origin;
     private double volumeOrMass;
     private double priceInUahPerUnit;
     private boolean homeMade;


    public MilkProduct() {

    }

    public MilkProduct(String nameOfMilkProduct, String origin, double volumeOrMass, double priceInUahPerUnit, boolean homeMade) {
        this.nameOfMilkProduct = nameOfMilkProduct;
        this.origin = origin;
        this.volumeOrMass = volumeOrMass;
        this.priceInUahPerUnit = priceInUahPerUnit;
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
        return  "\nName: " + nameOfMilkProduct + "\nOrigin: "
                + origin +  "\nPrice: " + priceInUahPerUnit+ "\n";
    }

}
