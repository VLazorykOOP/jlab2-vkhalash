import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть завдання:");
        System.out.println("1. Операції з товарами");
        System.out.println("2. Операції з прямокутниками");
        System.out.println("3. Операції з великими числами");
        int taskChoice = scanner.nextInt();
        scanner.nextLine();

        switch (taskChoice) {
            case 1:
                System.out.print("Введіть назву товару: ");
                String name = scanner.nextLine();

                System.out.print("Введіть дату реєстрації товару: ");
                String registrationDate = scanner.nextLine();

                System.out.print("Введіть ціну товару: ");
                float price = scanner.nextFloat();

                System.out.print("Введіть кількість товару: ");
                int quantity = scanner.nextInt();

                System.out.print("Введіть номер накладної товару: ");
                int invoiceNumber = scanner.nextInt();

                Goods item = new Goods(name, registrationDate, price, quantity, invoiceNumber);
                System.out.println("\n" + item);

                Goods itemDefault = new Goods();
                System.out.println("Об'єкт за замовчуванням: " + itemDefault);

                System.out.print("\nВведіть нову ціну товару: ");
                float newPrice = scanner.nextFloat();
                item.changePrice(newPrice);

                System.out.print("Введіть нову кількість товару: ");
                int newQuantity = scanner.nextInt();
                item.changeQuantity(newQuantity);

                System.out.println("\n" + item);

                Goods anotherItem = new Goods("IdeaPad 2", "16.01.2008", 14000, 10, 2);
                System.out.println("\nІнший товар для порівняння:");
                System.out.println(anotherItem);

                System.out.println("Однаковість товарів: " + item.equals(anotherItem));

                break;

            case 2:
                System.out.print("Введіть ширину прямокутника: ");
                float width = scanner.nextFloat();
                System.out.print("Введіть довжину прямокутника: ");
                float height = scanner.nextFloat();

                Rectangle rectangle = new Rectangle(width, height);
                System.out.println("\n" + rectangle);

                Rectangle rectangleDefault = new Rectangle();
                System.out.println("Об'єкт за замовчуванням: " + rectangleDefault);

                Rectangle otherRectangle = new Rectangle(2, 4);
                System.out.println("\nІнший прямокутник для порівняння:");
                System.out.println(otherRectangle);

                System.out.println("Рівність прямокутників: " + rectangle.equals(otherRectangle));
                System.out.println("Подібність прямокутників: " + rectangle.isSimilar(otherRectangle));

                System.out.println("Всього створено об'єктів: " + Rectangle.getCount());

                break;

            case 3:
                System.out.print("Введіть перше довге число: ");
                String firstNumberInput = scanner.nextLine();
                System.out.print("Введіть друге довге число: ");
                String secondNumberInput = scanner.nextLine();

                VeryLongNumber firstNumber = new VeryLongNumber(firstNumberInput);
                VeryLongNumber secondNumber = new VeryLongNumber(secondNumberInput);

                VeryLongNumber numberDefault = new VeryLongNumber();
                System.out.println("Об'єкт за замовчуванням: " + numberDefault);

                System.out.println("Сума: " + firstNumber.add(secondNumber));
                System.out.println("Різниця: " + firstNumber.subtract(secondNumber));
                System.out.println("Добуток: " + firstNumber.multiply(secondNumber));
                System.out.println("Частка: " + firstNumber.divide(secondNumber));

                VeryLongNumber maxValue = VeryLongNumber.findMax(firstNumber, secondNumber);
                VeryLongNumber minValue = VeryLongNumber.findMin(firstNumber, secondNumber);

                System.out.println("Максимальне значення: " + maxValue);
                System.out.println("Мінімальне значення: " + minValue);

                System.out.print("Введіть степінь для першого числа: ");
                String exponentInput = scanner.nextLine();
                VeryLongNumber exponent = new VeryLongNumber(exponentInput);

                System.out.println("Перше число в степені: " + firstNumber.pow(exponent.getValue()));
                System.out.println("Друге число в степені: " + secondNumber.pow(exponent.getValue()));

                System.out.println("Всього створено об'єктів: " + VeryLongNumber.getCount());

                break;

            default:
                System.out.println("Невірний вибір.");
                break;
        }
    }
}
