package com.practicalsoftwaredesign.designapen;
abstract public class Pen {

    private String manufacturer;
    private int price;

    private PenType penType;
    private String color;

    private WriteBehavior writeBehavior;

    public Pen(PenType penType, WriteBehavior writeBehavior) {
        this.penType = penType;
        this.writeBehavior = writeBehavior;
    }

    public void writes(){
        writeBehavior.write();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PenType getPenType() {
        return penType;
    }

    public void setPenType(PenType penType) {
        this.penType = penType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public WriteBehavior getWriteBehavior() {
        return writeBehavior;
    }

    public void setWriteBehavior(WriteBehavior writeBehavior) {
        this.writeBehavior = writeBehavior;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", penType=" + penType +
                ", color='" + color + '\'' +
                ", writeBehavior=" + writeBehavior +
                '}';
    }
}
