package com.practicalsoftwaredesign.designapen;

public class BallPenFactory implements PenFactory{
    @Override
    public Pen getPen() {
        return new BallPen();
    }
}
