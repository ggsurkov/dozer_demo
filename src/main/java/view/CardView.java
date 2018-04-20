package view;

public class CardView {

    private Long id;
    private String title;
    private String description;
    private Long stockBalance;
    private Long productPropertyCurrency;
    private String productPropertyColor;
    private Long productPropertySize;
    private Long shippingInfoCurrency;
    private Boolean shippingInfoShippingOn;
    private String securityHashKey;

    public CardView() {
    }

    public CardView(Long id, String title, String description, Long stockBalance, Long productPropertyCurrency, String productPropertyColor, Long productPropertySize, Long shippingInfoCurrency, Boolean shippingInfoShippingOn, String securityHashKey) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.stockBalance = stockBalance;
        this.productPropertyCurrency = productPropertyCurrency;
        this.productPropertyColor = productPropertyColor;
        this.productPropertySize = productPropertySize;
        this.shippingInfoCurrency = shippingInfoCurrency;
        this.shippingInfoShippingOn = shippingInfoShippingOn;
        this.securityHashKey = securityHashKey;
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

    public Long getProductPropertyCurrency() {
        return productPropertyCurrency;
    }

    public void setProductPropertyCurrency(Long productPropertyCurrency) {
        this.productPropertyCurrency = productPropertyCurrency;
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

    public Long getShippingInfoCurrency() {
        return shippingInfoCurrency;
    }

    public void setShippingInfoCurrency(Long shippingInfoCurrency) {
        this.shippingInfoCurrency = shippingInfoCurrency;
    }

    public Boolean getShippingInfoShippingOn() {
        return shippingInfoShippingOn;
    }

    public void setShippingInfoShippingOn(Boolean shippingInfoShippingOn) {
        this.shippingInfoShippingOn = shippingInfoShippingOn;
    }

    public String getSecurityHashKey() {
        return securityHashKey;
    }

    public void setSecurityHashKey(String securityHashKey) {
        this.securityHashKey = securityHashKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CardView cardView = (CardView) o;

        if (id != null ? !id.equals(cardView.id) : cardView.id != null) return false;
        if (title != null ? !title.equals(cardView.title) : cardView.title != null) return false;
        if (description != null ? !description.equals(cardView.description) : cardView.description != null)
            return false;
        if (stockBalance != null ? !stockBalance.equals(cardView.stockBalance) : cardView.stockBalance != null)
            return false;
        if (productPropertyCurrency != null ? !productPropertyCurrency.equals(cardView.productPropertyCurrency) : cardView.productPropertyCurrency != null)
            return false;
        if (productPropertyColor != null ? !productPropertyColor.equals(cardView.productPropertyColor) : cardView.productPropertyColor != null)
            return false;
        if (productPropertySize != null ? !productPropertySize.equals(cardView.productPropertySize) : cardView.productPropertySize != null)
            return false;
        if (shippingInfoCurrency != null ? !shippingInfoCurrency.equals(cardView.shippingInfoCurrency) : cardView.shippingInfoCurrency != null)
            return false;
        if (shippingInfoShippingOn != null ? !shippingInfoShippingOn.equals(cardView.shippingInfoShippingOn) : cardView.shippingInfoShippingOn != null)
            return false;
        return securityHashKey != null ? securityHashKey.equals(cardView.securityHashKey) : cardView.securityHashKey == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (stockBalance != null ? stockBalance.hashCode() : 0);
        result = 31 * result + (productPropertyCurrency != null ? productPropertyCurrency.hashCode() : 0);
        result = 31 * result + (productPropertyColor != null ? productPropertyColor.hashCode() : 0);
        result = 31 * result + (productPropertySize != null ? productPropertySize.hashCode() : 0);
        result = 31 * result + (shippingInfoCurrency != null ? shippingInfoCurrency.hashCode() : 0);
        result = 31 * result + (shippingInfoShippingOn != null ? shippingInfoShippingOn.hashCode() : 0);
        result = 31 * result + (securityHashKey != null ? securityHashKey.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CardView{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", stockBalance=" + stockBalance +
                ", productPropertyCurrency=" + productPropertyCurrency +
                ", productPropertyColor='" + productPropertyColor + '\'' +
                ", productPropertySize=" + productPropertySize +
                ", shippingInfoCurrency=" + shippingInfoCurrency +
                ", shippingInfoShippingOn=" + shippingInfoShippingOn +
                ", securityHashKey='" + securityHashKey + '\'' +
                '}';
    }
}
