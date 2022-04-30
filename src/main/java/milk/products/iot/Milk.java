package milk.products.iot;

import java.util.Objects;

public final class Milk extends MilkProduct {
    private double percentageOfFat;
    private boolean lactoseFree;

    public Milk(final String nameOfMilkProduct, final String origin,
                final double volumeOrMass, final double priceInUahPerKilo,
                final boolean homeMade, final double percentageOfFat,
                final boolean lactoseFree) {
        super(nameOfMilkProduct, origin, volumeOrMass, priceInUahPerKilo, homeMade);

        this.percentageOfFat = percentageOfFat;
        this.lactoseFree = lactoseFree;

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
        Milk milk = (Milk) o;
        return Double.compare(milk.percentageOfFat, percentageOfFat) == 0 && lactoseFree == milk.lactoseFree;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), percentageOfFat, lactoseFree);
    }
}
