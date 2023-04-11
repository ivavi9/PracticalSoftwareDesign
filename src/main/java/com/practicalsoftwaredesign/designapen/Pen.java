package com.practicalsoftwaredesign.designapen;
abstract public class Pen {

    protected String manufacturer;
    protected int price;

    protected PenType penType;
    protected String color;


    public Pen(String manufacturer, int price, PenType penType, String color) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.penType = penType;
        this.color = color;
    }

    public Pen() {
    }

    public void writes(){}

    @Override
    public String toString(){
        return price+" "+ manufacturer +" "+ color;
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
}
