package com.design.patterns.creational.factory;

public class PC extends Computer {
    private String ram;
    private String hdd;
    private String CPU;

    public PC(String ram, String hdd, String CPU){
        this.ram = ram;
        this.hdd = hdd;
        this.CPU = CPU;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }
}
