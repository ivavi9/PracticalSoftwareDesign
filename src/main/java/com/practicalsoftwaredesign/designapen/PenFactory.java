package com.practicalsoftwaredesign.designapen;
public class PenFactory {

    public static GelPen.Builder getGelPenBuilder(){
        return new GelPen.Builder();
    }

}
