public abstract class Sweet {
    String name;
    double weight;
    double price;
    String uniqueParameter;

    public Sweet(String name, double weight, double price, String uniqueParameter) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.uniqueParameter = uniqueParameter;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Название: %s, Вес: %.2f, Стоимость: %.2f, Уникальный параметр: %s.", name, weight, price, uniqueParameter);

    }
}
