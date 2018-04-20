package entity;

import java.util.List;

public class ProductPropertyEntity {

    private List<Long> arrayCount;


    public ProductPropertyEntity() {
    }

    public ProductPropertyEntity(List<Long> arrayCount) {
        this.arrayCount = arrayCount;
    }


    public List<Long> getArrayCount() {
        return arrayCount;
    }

    public void setArrayCount(List<Long> arrayCount) {
        this.arrayCount = arrayCount;
    }

    @Override
    public String toString() {
        return "ProductPropertyEntity{" +
                "arrayCount=" + arrayCount +
                '}';
    }
}
