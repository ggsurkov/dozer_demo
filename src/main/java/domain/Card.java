package domain;

import java.sql.Date;

public class Card {

    private final Long id;
    private final String title;
    private final String description;
    private final Long stockBalance;
    private final ProductProperty productProperty;
    private final ShippingInfo shippingInfo;

    public Card(Long id, String title, String description, Long stockBalance, ProductProperty productProperty, ShippingInfo shippingInfo) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.stockBalance = stockBalance;
        this.productProperty = productProperty;
        this.shippingInfo = shippingInfo;
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Long getStockBalance() {
        return stockBalance;
    }

    public ProductProperty getProductProperty() {
        return productProperty;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (id != null ? !id.equals(card.id) : card.id != null) return false;
        if (title != null ? !title.equals(card.title) : card.title != null) return false;
        if (description != null ? !description.equals(card.description) : card.description != null) return false;
        if (stockBalance != null ? !stockBalance.equals(card.stockBalance) : card.stockBalance != null) return false;
        if (productProperty != null ? !productProperty.equals(card.productProperty) : card.productProperty != null)
            return false;
        return shippingInfo != null ? shippingInfo.equals(card.shippingInfo) : card.shippingInfo == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (stockBalance != null ? stockBalance.hashCode() : 0);
        result = 31 * result + (productProperty != null ? productProperty.hashCode() : 0);
        result = 31 * result + (shippingInfo != null ? shippingInfo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", stockBalance=" + stockBalance +
                ", productProperty=" + productProperty +
                ", shippingInfo=" + shippingInfo +
                '}';
    }
}
