package hu.nive.ujratervezes.zarovizsga.cleaning;

public class House implements Cleanable {

    protected String address;
    protected int area;
    public final static int PRICE_PER_SQM = 80;

    public House(String address, int area) {
        this.address = address;
        this.area = area;
    }

    @Override
    public int clean() {
        return area * PRICE_PER_SQM ;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
