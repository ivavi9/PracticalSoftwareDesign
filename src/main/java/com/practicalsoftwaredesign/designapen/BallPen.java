package com.practicalsoftwaredesign.designapen;
public class BallPen extends Pen {
    private Refill refill;
    private boolean isRefillable;

    public BallPen(WriteBehavior writeBehavior) {
        super( PenType.GELPEN, writeBehavior);
    }

    public static class Builder{
        private Refill refill;
        private boolean isRefillable;


    }
}
