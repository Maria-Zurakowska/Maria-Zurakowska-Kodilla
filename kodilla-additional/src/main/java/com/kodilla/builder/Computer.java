package com.kodilla.builder;

public class Computer {
    private String name;
    private int ram;
    private HDD hdd;
    private GFX gfx;
    private GFX secondGfx;
    private Cooling cooling;

    private Computer(String name, int ram, HDD hdd, GFX gfx, GFX secondGfx, Cooling cooling) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.gfx = gfx;
        this.secondGfx = secondGfx;
        this.cooling = cooling;
    }
    public static class ComputerBuilder{
        private String name;
        private int ram;
        private HDD hdd;
        private GFX gfx;
        private GFX secondGfx;
        private Cooling cooling;

        public ComputerBuilder setName(String name){
            this.name = name;
            return this;
        }

        public ComputerBuilder setRam(int ram){
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setHdd(HDD hdd){
            this.hdd = hdd;
            return this;
        }
        public ComputerBuilder setGfx(GFX gfx){
            this.gfx = gfx;
            return this;
        }
        public ComputerBuilder setSecondGfx(GFX secondGfx){
            this.secondGfx = secondGfx;
            return this;
        }
        public ComputerBuilder setCooling(Cooling cooling){
            this.cooling = cooling;
            return this;
        }
        public Computer build(){
            return new Computer(name,ram,hdd,gfx,secondGfx,cooling);
        }
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public HDD getHdd() {
        return hdd;
    }

    public GFX getGfx() {
        return gfx;
    }

    public GFX getSecondGfx() {
        return secondGfx;
    }

    public Cooling getCooling() {
        return cooling;
    }
}
