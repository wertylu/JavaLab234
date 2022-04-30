package milk.products.iot;

import java.util.Objects;

public final class SourCream extends MilkProduct {
    private double percentageOfFat;


    public SourCream(final String nameOfMilkProduct,
                     final String origin, final double volumeOrMass,
                     final double priceInUahPerKilo, final boolean homeMade,
                     final double percentageOfFat) {
        super(nameOfMilkProduct, origin, volumeOrMass, priceInUahPerKilo, homeMade);

        this.percentageOfFat = percentageOfFat;

    }
    public String getHeaders() {
        return super.getHeaders() + ", HomeMade";
    }

    public String toCSV() {
        return super.toCSV() + ", " + this.getHomeMade();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        SourCream sourCream = (SourCream) o;
        return Double.compare(sourCream.percentageOfFat, percentageOfFat) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), percentageOfFat);
    }
}
