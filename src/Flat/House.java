package Flat;

/**
 * Класс, описывающий дом
 */
public class House extends Realty implements FlatInterface {
    private int floors;
    private double pricePerSquareMeter;
    public House(String city,String address, int area, int floors, double pricePerSquareMeter) {
        super(city,address, area);
        this.floors = floors;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public int getFloors() {
        return floors;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    public double getPricePerSquareMeter() {
        return pricePerSquareMeter;
    }
    public void setPricePerSquareMeter(double pricePerSquareMeter) {
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    @Override
    public String getType() {
        return "Дом";
    }
    @Override
    public double calculateCost() {
        return getArea() * pricePerSquareMeter;
    }
    @Override
    public String toString() {
        return "Дом{" +
                "Этажи=" + floors +
                ", Цена за кв.метр=" + pricePerSquareMeter +
                "} " + super.toString();
    }

}

