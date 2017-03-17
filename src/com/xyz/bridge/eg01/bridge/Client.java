package com.xyz.bridge.eg01.bridge;

public class Client {
    public static void main(String[] args) {
        Pen p1 = new WidePen(Color.RED);
        p1.draw();
    }
}
