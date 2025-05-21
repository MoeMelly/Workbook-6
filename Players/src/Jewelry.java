public class Jewelry extends FixedAsset{
    double karat;


    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }



    @Override
    public double getValue() {



        return 0;
    }


}
