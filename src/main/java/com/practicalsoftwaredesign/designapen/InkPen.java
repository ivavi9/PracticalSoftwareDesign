package com.practicalsoftwaredesign.designapen;public class InkPen extends Pen {

    private WriteBehavior writeBehavior;
    private Nib nib;

    public InkPen(String manufacturer, int price, PenType penType, String color, WriteBehavior writeBehavior, Nib nib) {
        super(manufacturer, price, penType, color);
        this.writeBehavior = writeBehavior;
        this.nib = nib;
    }

    public InkPen() {
    }

    @Override
    public void writes() {
        writeBehavior.write();
    }
}
