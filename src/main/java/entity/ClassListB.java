package entity;

import java.util.List;

public class ClassListB {
    private List<ProductPropertyEntity> productPropertyCount;

    public ClassListB() {
    }

    public ClassListB(List<ProductPropertyEntity> productPropertyCount) {
        this.productPropertyCount = productPropertyCount;
    }

    public List<ProductPropertyEntity> getProductPropertyCount() {
        return productPropertyCount;
    }

    public void setProductPropertyCount(List<ProductPropertyEntity> productPropertyCount) {
        this.productPropertyCount = productPropertyCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassListB that = (ClassListB) o;

        return productPropertyCount != null ? productPropertyCount.equals(that.productPropertyCount) : that.productPropertyCount == null;
    }

    @Override
    public int hashCode() {
        return productPropertyCount != null ? productPropertyCount.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ClassListB{" +
                "productPropertyCount=" + productPropertyCount +
                '}';
    }
}
