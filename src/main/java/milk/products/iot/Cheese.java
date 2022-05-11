package milk.products.iot;

import java.util.Objects;

public final class Cheese extends MilkProduct {
    private final String typeOfCheese;
    private final boolean slicedOrNot;

    public Cheese(final String nameOfMilkProduct, final String origin,
                  final double volumeOrMass, final double priceInUahPerKilo,
                  final boolean homeMade, final String typeOfCheese,
                  final boolean slicedOrNot) {
        super(nameOfMilkProduct, origin, volumeOrMass,
                priceInUahPerKilo, homeMade);
        this.typeOfCheese = typeOfCheese;
        this.slicedOrNot = slicedOrNot;
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
        Cheese cheese = (Cheese) o;
            return slicedOrNot == cheese.slicedOrNot
                && Objects.equals(typeOfCheese, cheese.typeOfCheese);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfCheese, slicedOrNot);
    }
}
