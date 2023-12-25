package com.example.creation_perso_api.dto;

public class CaracteristiqueDto {
    public int adrMin;
    public int adrMax;
    public int chaMin;
    public int chaMax;
    public int couMin;
    public int couMax;
    public int foMin;
    public int foMax;
    public int intMin;
    public int intMax;

    public CaracteristiqueDto() {
        this.adrMin = 0;
        this.adrMax = 20;
        this.chaMin = 0;
        this.chaMax = 20;
        this.couMin = 0;
        this.couMax = 20;
        this.foMin = 0;
        this.foMax = 20;
        this.intMin = 0;
        this.intMax = 20;
    }

    public int getAdrMin() {
        return adrMin;
    }

    public void setAdrMin(int adrMin) {
        this.adrMin = adrMin;
    }

    public int getAdrMax() {
        return adrMax;
    }

    public void setAdrMax(int adrMax) {
        this.adrMax = adrMax;
    }

    public int getChaMin() {
        return chaMin;
    }

    public void setChaMin(int chaMin) {
        this.chaMin = chaMin;
    }

    public int getChaMax() {
        return chaMax;
    }

    public void setChaMax(int chaMax) {
        this.chaMax = chaMax;
    }

    public int getCouMin() {
        return couMin;
    }

    public void setCouMin(int couMin) {
        this.couMin = couMin;
    }

    public int getCouMax() {
        return couMax;
    }

    public void setCouMax(int couMax) {
        this.couMax = couMax;
    }

    public int getFoMin() {
        return foMin;
    }

    public void setFoMin(int foMin) {
        this.foMin = foMin;
    }

    public int getFoMax() {
        return foMax;
    }

    public void setFoMax(int foMax) {
        this.foMax = foMax;
    }

    public int getIntMin() {
        return intMin;
    }

    public void setIntMin(int intMin) {
        this.intMin = intMin;
    }

    public int getIntMax() {
        return intMax;
    }

    public void setIntMax(int intMax) {
        this.intMax = intMax;
    }
}
