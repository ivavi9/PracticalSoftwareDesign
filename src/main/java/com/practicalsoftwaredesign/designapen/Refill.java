package com.practicalsoftwaredesign.designapen;

import java.util.List;

public class Refill {
    private Nib nib;
    private List<InkFeatures> inkFeatures;

    public Nib getNib() {
        return nib;
    }

    public void setNib(Nib nib) {
        this.nib = nib;
    }

    public List<InkFeatures> getInkFeatures() {
        return inkFeatures;
    }

    public void setInkFeatures(List<InkFeatures> inkFeatures) {
        this.inkFeatures = inkFeatures;
    }
}
