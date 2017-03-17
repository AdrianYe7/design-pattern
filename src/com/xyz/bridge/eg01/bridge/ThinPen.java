package com.xyz.bridge.eg01.bridge;

public class ThinPen extends Pen {

    ThinPen(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("draw a picture with a thin " + color.getColorName() + " pen");
    }

}
