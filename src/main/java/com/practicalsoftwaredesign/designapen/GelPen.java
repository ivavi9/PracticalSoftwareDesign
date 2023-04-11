package com.practicalsoftwaredesign.designapen;public class GelPen extends Pen{

    private WriteBehavior writeBehavior;

    public GelPen() {
    }

    public GelPen(String manufacturer, int price, PenType penType, String color, WriteBehavior writeBehavior) {
        super(manufacturer, price, penType, color);
        this.writeBehavior = writeBehavior;
    }

    @Override
    public void writes() {
        writeBehavior.write();

    }
}
