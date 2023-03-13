import Flat.House;
import Flat.RealtyAgency;
import Flat.Flat;


public class Main {
    public static void main(String[] args) {
        RealtyAgency<Flat> flatAgency = new RealtyAgency<Flat>();
        flatAgency.addRealty(new Flat("Хабаровск","ул. Пушкина, д. 10, кв. 5", 60, 5, 2, 100000));
        flatAgency.addRealty(new Flat("Москва","ул. Лермонтова, д. 15, кв. 20", 80, 20, 3, 150000));
        System.out.println("Общая стоимость квартир: " + flatAgency.calculateTotalCost());
        flatAgency.printRealties();

        RealtyAgency<House> houseAgency = new RealtyAgency<House>();
        houseAgency.addRealty(new House("Москва","ул. Гоголя, д. 5", 200, 2, 50000));
        houseAgency.addRealty(new House("Краснодар","ул. Тургенева, д. 25", 300, 3, 75000));
        System.out.println("Общая стоимость домов: " + houseAgency.calculateTotalCost());
        houseAgency.printRealties();
    }
}