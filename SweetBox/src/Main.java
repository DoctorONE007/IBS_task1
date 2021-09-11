
public class Main {

    public static void main(String[] args) {
        // write your code here
        Sweet chocolate = new Chocolate("Марс", 110, 54, "Карамель");
        Sweet cake = new Cake("Чизкейк", 1000, 1200, "Творог");
        Sweet candy = new Candy("Скитлз", 32, 85, "Кислинка");
        Sweet cookie = new Cookie("Вафли", 157, 68, "Шоколад");

        Box box = new Box();
        box.addSweet(chocolate);
        box.addSweet(cake);
        box.addSweet(candy);
        box.addSweet(cookie);

        box.printAllInfo();

    }
}
