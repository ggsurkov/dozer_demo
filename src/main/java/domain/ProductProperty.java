package domain;

public class ProductProperty {
    private Long count;
    private String color;
    private Long size;

    public ProductProperty() {

    }

    public ProductProperty(Long count, String color, Long size) {
        this.count = count;
        this.color = color;
        this.size = size;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getCount() {
        return count;
    }

    public String getColor() {
        return color;
    }

    public Long getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductProperty that = (ProductProperty) o;

        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        return size != null ? size.equals(that.size) : that.size == null;
    }

    @Override
    public int hashCode() {
        int result = count != null ? count.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProductProperty{" +
                "count=" + count +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
