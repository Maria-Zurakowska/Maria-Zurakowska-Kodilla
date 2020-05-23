package com.kodilla.builder;

public class App {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .setName("G4M3R")
                .setCooling(Cooling.WATER)
                .setRam(64)
                .setHdd(new HDD(HddType.SSD_PCI, 1024))
                .setGfx(new GFX.GFXBuilder()
                        .setGfxType(GfxType.GFORCE_RTX)
                        .setMemorySize(64)
                        .setWaterCooling(true)
                        .build())
                .build();
    }
}
