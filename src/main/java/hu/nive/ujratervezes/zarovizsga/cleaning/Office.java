package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements Cleanable {

    protected String address;
    protected int area;
    protected int floors;
    public final static int PRICE_PER_SQM = 100;

    public Office(String address, int area, int floors) {
        this.address = address;
        this.area = area;
        this.floors = floors;
    }

    @Override
    public int clean() {
        return area * PRICE_PER_SQM * floors;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
