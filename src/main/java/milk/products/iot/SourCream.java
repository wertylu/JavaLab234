package milk.products.iot;

public class SourCream extends MilkProduct {
    private double percentageOfFat;


    public SourCream(String nameOfMilkProduct, String origin, double volumeOrMass, double priceInUahPerKilo, boolean homeMade, double percentageOfFat) {
        super(nameOfMilkProduct, origin, volumeOrMass, priceInUahPerKilo, homeMade);

        this.percentageOfFat = percentageOfFat;

    }
    public String getHeaders(){
        return super.getHeaders() +", HomeMade";
    }

    public String toCSV(){
        return super.toCSV()+ ", "+ this.getHomeMade();
    }
}

