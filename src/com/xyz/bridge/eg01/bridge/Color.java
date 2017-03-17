package com.xyz.bridge.eg01.bridge;

public enum Color {
    RED,BLUE;
    
    public String getColorName() {
        String colorName = null;
        switch (this) {
            case RED:
                colorName = "red";
                break;
            case BLUE:
                colorName = "blue";
                break;
            default:
                break;
        }
        return colorName;
    }
}
