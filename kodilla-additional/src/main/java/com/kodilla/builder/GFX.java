package com.kodilla.builder;

public class GFX {
    private GfxType gfxType;
    private int memorySize;
    private boolean waterCooling;

    private GFX(GfxType gfxType, int memorySize, boolean waterCooling) {
        this.gfxType = gfxType;
        this.memorySize = memorySize;
        this.waterCooling = waterCooling;
    }
    public static class GFXBuilder{
        private GfxType gfxType;
        private int memorySize;
        private boolean waterCooling;

        public GFXBuilder setGfxType(GfxType gfxType){
            this.gfxType = gfxType;
            return this;
        }
        public GFXBuilder setMemorySize(int memorySize){
            this.memorySize = memorySize;
            return this;
        }
        public GFXBuilder setWaterCooling(boolean waterCooling){
            this.waterCooling = waterCooling;
            return this;
        }

        public GFX build(){
            return new GFX(gfxType,memorySize,waterCooling);
        }
    }

    public GfxType getGfxType() {
        return gfxType;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public boolean isWaterCooling() {
        return waterCooling;
    }
}
