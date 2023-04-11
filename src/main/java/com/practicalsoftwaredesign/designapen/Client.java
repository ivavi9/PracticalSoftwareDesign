package com.practicalsoftwaredesign.designapen;
public class Client {

    public static void main(String[] args) {
        Pen pen = PenFactory.getPenFactoryByType(PenType.BALLPEN).getPen();


    }
}
