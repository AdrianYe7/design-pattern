package com.xyz.immutable.weak;

/**
 * 外界可变对象
 * <p>Title: OutObject</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public class OutObject implements Cloneable{
    private String outName;

    public String getOutName() {
        return outName;
    }

    public void setOutName(String outName) {
        this.outName = outName;
    }
    
    @Override
    public OutObject clone() {
        OutObject out = null;
        try {
            out = (OutObject) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return out;
    }
}
