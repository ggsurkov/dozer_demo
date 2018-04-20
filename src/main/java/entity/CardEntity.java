package entity;

public class CardEntity {

    private Long id;
    private String title;
    private String description;
    private Long stockBalance;
    private Long productPropertyCount;
    private String productPropertyColor;
    private Long productPropertySize;
    private Long shippingInfoCount;
    private Boolean shippingInfoShippingOn;

    public CardEntity() {

    }

    public CardEntity(Long id, String title, String description, Long stockBalance, Long productPropertyCurrency, String productPropertyColor, Long productPropertySize, Long shippingInfoCurrency, Boolean shippingInfoShippingOn) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.stockBalance = stockBalance;
        this.productPropertyCount = productPropertyCurrency;
        this.productPropertyColor = productPropertyColor;
        this.productPropertySize = productPropertySize;
        this.shippingInfoCount = shippingInfoCurrency;
        this.shippingInfoShippingOn = shippingInfoShippingOn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getStockBalance() {
        return stockBalance;
    }

    public void setStockBalance(Long stockBalance) {
        this.stockBalance = stockBalance;
    }

    public Long getProductPropertyCount() {
        return productPropertyCount;
    }

    public void setProductPropertyCount(Long productPropertyCount) {
        this.productPropertyCount = productPropertyCount;
    }

    public String getProductPropertyColor() {
        return productPropertyColor;
    }

    public void setProductPropertyColor(String productPropertyColor) {
        this.productPropertyColor = productPropertyColor;
    }

    public Long getProductPropertySize() {
        return productPropertySize;
    }

    public void setProductPropertySize(Long productPropertySize) {
        this.productPropertySize = productPropertySize;
    }

    public Long getShippingInfoCount() {
        return shippingInfoCount;
    }

    public void setShippingInfoCount(Long shippingInfoCount) {
        this.shippingInfoCount = shippingInfoCount;
    }

    public Boolean getShippingInfoShippingOn() {
        return shippingInfoShippingOn;
    }

    public void setShippingInfoShippingOn(Boolean shippingInfoShippingOn) {
        this.shippingInfoShippingOn = shippingInfoShippingOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CardEntity that = (CardEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (stockBalance != null ? !stockBalance.equals(that.stockBalance) : that.stockBalance != null) return false;
        if (productPropertyCount != null ? !productPropertyCount.equals(that.productPropertyCount) : that.productPropertyCount != null)
            return false;
        if (productPropertyColor != null ? !productPropertyColor.equals(that.productPropertyColor) : that.productPropertyColor != null)
            return false;
        if (productPropertySize != null ? !productPropertySize.equals(that.productPropertySize) : that.productPropertySize != null)
            return false;
        if (shippingInfoCount != null ? !shippingInfoCount.equals(that.shippingInfoCount) : that.shippingInfoCount != null)
            return false;
        return shippingInfoShippingOn != null ? shippingInfoShippingOn.equals(that.shippingInfoShippingOn) : that.shippingInfoShippingOn == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (stockBalance != null ? stockBalance.hashCode() : 0);
        result = 31 * result + (productPropertyCount != null ? productPropertyCount.hashCode() : 0);
        result = 31 * result + (productPropertyColor != null ? productPropertyColor.hashCode() : 0);
        result = 31 * result + (productPropertySize != null ? productPropertySize.hashCode() : 0);
        result = 31 * result + (shippingInfoCount != null ? shippingInfoCount.hashCode() : 0);
        result = 31 * result + (shippingInfoShippingOn != null ? shippingInfoShippingOn.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CardEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", stockBalance=" + stockBalance +
                ", productPropertyCount=" + productPropertyCount +
                ", productPropertyColor='" + productPropertyColor + '\'' +
                ", productPropertySize=" + productPropertySize +
                ", shippingInfoCount=" + shippingInfoCount +
                ", shippingInfoShippingOn=" + shippingInfoShippingOn +
                '}';
    }
}
