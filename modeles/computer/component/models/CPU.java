package adbistju.system.modeles.computer.component.models;

import adbistju.system.modeles.computer.component.enums.Socket;

public class CPU {
    private float processorFrequency;
    private int core;
    private Socket socket;
    private int power;

    private CPU(float processorFrequency, int core, Socket socket, int power) {
        this.processorFrequency = processorFrequency;
        this.core = core;
        this.socket = socket;
        this.power = power;
    }

    public float getProcessorFrequency() {
        return processorFrequency;
    }

    public int getCore() {
        return core;
    }

    public Socket getSocket() {
        return socket;
    }

    public int getPower() {
        return power;
    }

    public static CPU createIntelI511600kf() {
        return new CPU(3.9f,6,Socket.LGA1200,125);
    }

    public static CPU createIntelI711700k() {
        return new CPU(3.6f,8,Socket.LGA1200,150);
    }

    public static CPU createIntelDualCore() {
        return new CPU(3.16f,2, Socket.LGA775,65);
    }

    public static CPU createCeleronE1500() {
        return new CPU(2.2f,2, Socket.LGA775,50);
    }

    public static CPU createIntelI52300() {
        return new CPU(2.8f,4, Socket.LGA1155,65);
    }

    public static CPU createIntelI32120() {
        return new CPU(3.3f,2, Socket.LGA1155,60);
    }

    @Override
    public String toString() {
        return "CPU{" +
                "processorFrequency=" + processorFrequency +
                ", core=" + core +
                ", socket=" + socket +
                ", power=" + power +
                '}';
    }
}
