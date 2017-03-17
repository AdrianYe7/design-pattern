package com.xyz.bridge.eg01.bridge;

public abstract class Pen {
    protected Color color;
    Pen(Color color) {
        this.color = color;
    }
    
    public abstract void draw();
}
