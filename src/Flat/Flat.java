package Flat;

/**
 * Класс, описывающий квартиру
 */
public class Flat extends Realty implements FlatInterface {
    private int number;
    private int rooms;
    private double pricePerSquareMeter;
    public Flat(String city,String address, int area, int number, int rooms, double pricePerSquareMeter) {
        super(city,address, area);
        this.number = number;
        this.rooms = rooms;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getRooms() {
        return rooms;
    }
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    public double getPricePerSquareMeter() {
        return pricePerSquareMeter;
    }
    public void setPricePerSquareMeter(double pricePerSquareMeter) {
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    @Override
    public String getType() {
        return "Квартира";
    }
    @Override
    public double calculateCost() {
        return getArea() * pricePerSquareMeter;
    }
    @Override
    public String toString() {
        return "Квартира{" +
                "Номер=" + number +
                ", Комнаты=" + rooms +
                ", Цена за кв.метр=" + pricePerSquareMeter +
                "} " + super.toString();
    }
}
