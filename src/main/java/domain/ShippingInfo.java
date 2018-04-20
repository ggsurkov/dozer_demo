package domain;

public class ShippingInfo {
    private final Long count;
    private final Boolean shippingOn;

    public ShippingInfo(Long shippingCurrency, Boolean shippingOn) {
        this.count = shippingCurrency;
        this.shippingOn = shippingOn;
    }

    public Long getCount() {
        return count;
    }

    public Boolean getShippingOn() {
        return shippingOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShippingInfo that = (ShippingInfo) o;

        if (count != null ? !count.equals(that.count) : that.count != null)
            return false;
        return shippingOn != null ? shippingOn.equals(that.shippingOn) : that.shippingOn == null;
    }

    @Override
    public int hashCode() {
        int result = count != null ? count.hashCode() : 0;
        result = 31 * result + (shippingOn != null ? shippingOn.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ShippingInfo{" +
                "count=" + count +
                ", shippingOn=" + shippingOn +
                '}';
    }
}
