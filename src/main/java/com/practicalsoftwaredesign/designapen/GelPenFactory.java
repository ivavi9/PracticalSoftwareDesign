package com.practicalsoftwaredesign.designapen;

public class GelPenFactory implements PenFactory{
    @Override
    public Pen getPen() {
        GelPen pen = new GelPen();
        pen.setPenType(PenType.GELPEN);
        return pen;
    }
}
