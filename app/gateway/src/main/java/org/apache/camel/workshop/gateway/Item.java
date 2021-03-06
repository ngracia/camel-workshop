package org.apache.camel.workshop.gateway;

public class Item {

    private String id;

    private String name;

    private String image;

    private int stockUnits;

    private int price;

    private boolean recommended;

    public Item() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockUnits() {
        return stockUnits;
    }

    public void setStockUnits(int stockUnits) {
        this.stockUnits = stockUnits;
    }

    public boolean isRecommended() {
        return recommended;
    }

    public void setRecommended(boolean recommended) {
        this.recommended = recommended;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", stockUnits=" + stockUnits +
                ", price=" + price +
                '}';
    }


}
