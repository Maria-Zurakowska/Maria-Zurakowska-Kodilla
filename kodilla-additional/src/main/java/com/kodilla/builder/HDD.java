package com.kodilla.builder;

public class HDD {
    private HddType hddType;
    private int size;

    public HDD(HddType hddType, int size) {
        this.hddType = hddType;
        this.size = size;
    }

    public HddType getHddType() {
        return hddType;
    }

    public int getSize() {
        return size;
    }
}
