package Flat;

import java.util.Objects;

/**
 * Абстрактный класс, описывающий объект недвижимости
 */
public abstract class Realty implements FlatInterface {
    private String city;
    private String address;
    private int area;

    public Realty(String city,String address, int area) {
        this.city = city;
        this.address = address;
        this.area = area;
    }
     public String getCity() {
         return city;
     }

     public void setCity(String city) {
         this.city = city;
     }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

     public abstract String getType();

     @Override
    public String toString() {
        return "Недвижимость{" +
                "город=" + city + '\'' +
                "адрес='" + address + '\'' +
                ", площадь=" + area +
                '}';
    }
     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Realty realty = (Realty) o;
         return area == realty.area && Objects.equals(address, realty.address);
     }
     @Override
     public int hashCode() {
         return Objects.hash(address, area);
     }

}
