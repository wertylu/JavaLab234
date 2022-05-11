package milk.products.iot;

import lombok.Data;
import java.util.Objects;

@Data
public class MilkProduct {
     private String nameOfMilkProduct;
     private String origin;
     private double volumeOrMass;
     private double priceInUahPerUnit;
     private boolean homeMade;




    public MilkProduct(final String nameOfMilkProduct, final String origin, final double volumeOrMass,
                       final double priceInUahPerUnit, final boolean homeMade) {
        this.nameOfMilkProduct = nameOfMilkProduct;
        this.origin = origin;
        this.volumeOrMass = volumeOrMass;
        this.priceInUahPerUnit = priceInUahPerUnit;
        this.homeMade = homeMade;
    }


    @Override
    public String toString() {

        return   nameOfMilkProduct + ", " + origin +  ", Price: " + priceInUahPerUnit + ", Home made: " + homeMade + "\n";
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MilkProduct that = (MilkProduct) o;
        return Double.compare(that.volumeOrMass, volumeOrMass) == 0 && Double.compare(that.priceInUahPerUnit, priceInUahPerUnit) == 0 && homeMade == that.homeMade && Objects.equals(nameOfMilkProduct, that.nameOfMilkProduct) && Objects.equals(origin, that.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfMilkProduct, origin, volumeOrMass, priceInUahPerUnit, homeMade);
    }

    public boolean getHomeMade() {
        return homeMade; }

    public String getHeaders() {
        return "Product, Price";
    }

    public String toCSV() {
        return this.getNameOfMilkProduct() + ", " + this.getPriceInUahPerUnit();
    }


}

