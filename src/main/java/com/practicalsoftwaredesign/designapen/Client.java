package com.practicalsoftwaredesign.designapen;
public class Client {

    public static void main(String[] args) {
       Pen pen = PenFactory.getGelPenBuilder().setRefillable(true).setRefill(new Refill()).build();
       pen.setManufacturer("Markus");
       pen.setColor("Red");
       pen.setPrice(21);
        System.out.println(pen);


    }
}
