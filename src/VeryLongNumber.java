import java.math.BigInteger;

public class VeryLongNumber {
    private static int count = 0;
    private BigInteger value;

    {
        value = BigInteger.valueOf(0);
    }

    public VeryLongNumber() {
        count++;
    }

    public VeryLongNumber(String value) {
        this.value = new BigInteger(value);
        count++;
    }

    public static VeryLongNumber findMax(VeryLongNumber a, VeryLongNumber b) {
        return (a.value.compareTo(b.value) > 0) ? a : b;
    }

    public static VeryLongNumber findMin(VeryLongNumber a, VeryLongNumber b) {
        return (a.value.compareTo(b.value) < 0) ? a : b;
    }

    public static int getCount() {
        return count;
    }

    public VeryLongNumber add(VeryLongNumber other) {
        return new VeryLongNumber(this.value.add(other.value).toString());
    }

    public VeryLongNumber subtract(VeryLongNumber other) {
        return new VeryLongNumber(this.value.subtract(other.value).toString());
    }

    public VeryLongNumber multiply(VeryLongNumber other) {
        return new VeryLongNumber(this.value.multiply(other.value).toString());
    }

    public VeryLongNumber divide(VeryLongNumber other) {
        return new VeryLongNumber(this.value.divide(other.value).toString());
    }

    public VeryLongNumber pow(BigInteger exponent) {
        return new VeryLongNumber(this.value.pow(exponent.intValue()).toString());
    }

    public BigInteger getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof VeryLongNumber) {
            VeryLongNumber other = (VeryLongNumber) object;
            return this.value.equals(other.value);
        } else {
            return false;
        }
    }
}
