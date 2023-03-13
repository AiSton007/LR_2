package Flat;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, описывающий агентство недвижимости
 * @param <T> тип объекта недвижимости
 */
public class RealtyAgency<T extends Realty & FlatInterface> {
    private List<T> realties;
    public RealtyAgency() {
        realties = new ArrayList<>();
    }
    /**
     * Метод, добавляющий объект недвижимости в список
     * @param realty объект недвижимости
     */
    public void addRealty(T realty) {
        realties.add(realty);
    }
    /**
     * Метод, вычисляющий общую стоимость всех объектов недвижимости
     * @return общая стоимость
     */
    public double calculateTotalCost() {
        double totalCost = 0;
        for (T realty : realties) {
            totalCost += realty.calculateCost();
        }
        return totalCost;
    }
    /**
     * Метод, выводящий информацию о всех объектах недвижимости
     */
    public void printRealties() {
        for (T realty : realties) {
            System.out.println(realty.getType() + " " + realty.getAddress() + ", площадь: " + realty.getArea() +
                    ", стоимость: " + realty.calculateCost());
        }
    }
}
