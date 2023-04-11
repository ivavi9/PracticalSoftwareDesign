package com.practicalsoftwaredesign.designapen;
public class BallPen extends Pen {

    private WriteBehavior writeBehavior;

    public BallPen(String manufacturer, int price, PenType penType, String color, WriteBehavior writeBehavior) {
        super(manufacturer, price, penType, color);
        this.writeBehavior = writeBehavior;
    }

    public BallPen() {
    }

    @Override
    public void writes() {
        writeBehavior.write();
    }
}
