package domain;

import java.util.List;

public class ClassListA {
    private List<ProductProperty> arrayProductProperty;

    public ClassListA() {
    }

    public ClassListA(List<ProductProperty> arrayProductProperty) {
        this.arrayProductProperty = arrayProductProperty;
    }

    public List<ProductProperty> getArrayProductProperty() {
        return arrayProductProperty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassListA that = (ClassListA) o;

        return arrayProductProperty != null ? arrayProductProperty.equals(that.arrayProductProperty) : that.arrayProductProperty == null;
    }

    @Override
    public int hashCode() {
        return arrayProductProperty != null ? arrayProductProperty.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ClassListA{" +
                "arrayProductProperty=" + arrayProductProperty +
                '}';
    }
}
