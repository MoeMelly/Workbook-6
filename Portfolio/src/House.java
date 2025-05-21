public class House extends FixedAsset {
    int yearBuilt;
    int squareFeet;
    int bedrooms;


    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
