package com.xyz.bridge.eg01.bridge;

public class WidePen extends Pen {

    WidePen(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("draw a picture with a wide " + color.getColorName() + " pen");
    }

}
