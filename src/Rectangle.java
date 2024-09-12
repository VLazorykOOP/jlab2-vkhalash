public class Rectangle {
    private static int count = 0;
    private float width;
    private float height;

    {
        width = 0;
        height = 0;
    }

    public Rectangle() {
        count++;
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }

    public boolean isSimilar(Rectangle other) {
        return (this.width / this.height) == (other.width / other.height);
    }

    @Override
    public String toString() {
        return "Прямокутник {" +
                "Ширина: " + width +
                ", Висота: " + height +
                ", Площа: " + getArea() +
                ", Периметр: " + getPerimeter() +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Rectangle) {
            Rectangle other = (Rectangle) object;
            return width == other.width && height == other.height;
        } else {
            return false;
        }
    }
}
