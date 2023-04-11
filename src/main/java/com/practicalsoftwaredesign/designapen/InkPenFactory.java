package com.practicalsoftwaredesign.designapen;

public class InkPenFactory implements PenFactory{
    @Override
    public Pen getPen() {
        return new InkPen();
    }
}
