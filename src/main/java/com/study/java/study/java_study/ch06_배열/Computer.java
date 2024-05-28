package com.study.java.study.java_study.ch06_배열;

public class Computer {
    private String cpu;
    private String ram;

    public Computer(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
