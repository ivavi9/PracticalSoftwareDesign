package com.practicalsoftwaredesign.designapen;public class GelPen extends Pen{


    private Refill refill;
    private boolean isRefillable;
    public GelPen(WriteBehavior writeBehavior) {
        super(PenType.GELPEN,writeBehavior);
    }



    public static class Builder{
        private Refill refill;
        private boolean isRefillable;

        public Builder setRefill(Refill refill) {
            this.refill = refill;
            return this;
        }

        public Builder setRefillable(boolean refillable) {
            isRefillable = refillable;
            return this;
        }

        public GelPen build(){
            GelPen gelPen = new GelPen(new GelWrite());
            gelPen.refill = this.refill;
            gelPen.isRefillable = this.isRefillable;
            return gelPen;
        }

        @Override
        public String toString() {
            super.toString();
            return "Builder{" +
                    "refill=" + refill +
                    ", isRefillable=" + isRefillable +
                    '}';
        }
    }
}
