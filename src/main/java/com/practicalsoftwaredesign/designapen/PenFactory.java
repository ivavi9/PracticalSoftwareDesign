package com.practicalsoftwaredesign.designapen;
public interface PenFactory {

    public Pen getPen();

    public static PenFactory getPenFactoryByType(PenType penType){
        switch (penType){
            case BALLPEN:
                return new BallPenFactory();
            case GELPEN:
                return new GelPenFactory();
            case FOUNTAINPEN:
                return new InkPenFactory();

        }

        return null;
    }
}
