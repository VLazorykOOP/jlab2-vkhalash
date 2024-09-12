import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Goods {
    private static final SimpleDateFormat DATE_FORMAT
            = new SimpleDateFormat("dd.MM.yyyy");
    private String name;
    private Date registrationDate;
    private float price;
    private int quantity;
    private int invoiceNumber;

    {
        name = "Product Name";
        registrationDate = new Date();
        price = 0;
        quantity = 0;
        invoiceNumber = 0;
    }

    public Goods() {
    }

    public Goods(String name, String registrationDateStr, float price
            , int quantity, int invoiceNumber) throws ParseException {
        this.name = name;
        this.registrationDate = parseDate(registrationDateStr);
        this.price = price;
        this.quantity = quantity;
        this.invoiceNumber = invoiceNumber;
    }

    private static Date parseDate(String dateStr) throws ParseException {
        return DATE_FORMAT.parse(dateStr);
    }

    public static String formatPrice(double price) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        return currencyFormat.format(price);
    }

    public static String formatDate(Date date) {
        return DATE_FORMAT.format(date);
    }

    public void changePrice(float newPrice) {
        this.price = newPrice;
    }

    public void changeQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public float getTotalValue() {
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return "Товар {" +
                "Назва: '" + name + '\'' +
                ", Дата реєстрації: " + formatDate(registrationDate) +
                ", Ціна: '" + formatPrice(price) + '\'' +
                ", Кількість: " + quantity +
                ", Номер накладної: " + invoiceNumber +
                ", Загальна вартість: " + formatPrice(getTotalValue()) +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Goods) {
            Goods other = (Goods) object;
            return name.equals(other.name) &&
                    price == other.price &&
                    quantity == other.quantity &&
                    invoiceNumber == other.invoiceNumber &&
                    registrationDate.equals(other.registrationDate);
        } else {
            return false;
        }
    }
}
