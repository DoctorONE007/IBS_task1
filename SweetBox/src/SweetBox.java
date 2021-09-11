public interface SweetBox {
    void addSweet(Sweet sweet);

    void deleteByIndex(int index);

    void deleteLast();

    void printWeight();

    void printPrice();

    void printAllInfo();

    void weightOptimization(double min);

    void priceOptimization(double min);
}
