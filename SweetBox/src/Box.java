import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Box implements SweetBox {
    private double sumweight = 0;
    private double sumprise = 0;
    private final List<Sweet> sweets = new ArrayList<>();

    @Override
    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
        sumweight += sweet.getWeight();
        sumprise += sweet.getPrice();
    }

    @Override
    public void deleteByIndex(int index) {
        if (!sweets.isEmpty() && index < sweets.size() && index >= 0) {
            sumprise -= sweets.get(index).getPrice();
            sumweight -= sweets.get(index).getWeight();
            sweets.remove(index);
        }
    }

    @Override
    public void deleteLast() {
        deleteByIndex(sweets.size() - 1);
    }

    @Override
    public void printWeight() {
        if (sweets.isEmpty())
            System.out.println("Вес коробки - 0");
        else {
            double weight = 0;
            for (Sweet sweet : sweets) {
                weight += sweet.getWeight();
            }
            System.out.println("Вес коробки - " + weight);
        }
    }

    @Override
    public void printPrice() {
        if (sweets.isEmpty())
            System.out.println("Стоимость коробки - 0");
        else {
            double price = 0;
            for (Sweet sweet : sweets) {
                price += sweet.getPrice();
            }
            System.out.println("Стоимость коробки - " + price);
        }
    }

    @Override
    public void printAllInfo() {
        if (sweets.isEmpty())
            System.out.println("Коробка пустая");
        else {
            System.out.println("Общий вес коробки - " + sumweight);
            System.out.println("Общая цена коробки - " + sumprise);
            System.out.println("Информация о сладостях в коробке:");
            for (Sweet sweet : sweets) {
                System.out.println(sweet.toString());
            }
        }
    }

    @Override
    public void weightOptimization(double min) {
        if (sweets.isEmpty())
            System.out.println("Коробка оптимизирована относительно веса - коробка пустая");
        else {
            if (sumweight < min)
                System.out.println("Коробка оптимизирована относительно веса");
            else {
                deleteByIndex(sweets.indexOf(Collections.min(sweets, Comparator.comparing(Sweet::getWeight))));
                weightOptimization(min);
            }
        }
    }

    @Override
    public void priceOptimization(double min) {
        if (sweets.isEmpty())
            System.out.println("Коробка оптимизирована относительно стоимости - коробка пустая");
        else {
            if (sumprise < min)
                System.out.println("Коробка оптимизирована относительно стоимости");
            else {
                deleteByIndex(sweets.indexOf(Collections.min(sweets, Comparator.comparing(Sweet::getPrice))));
                priceOptimization(min);
            }
        }
    }
}
