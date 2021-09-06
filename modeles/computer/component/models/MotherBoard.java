package adbistju.system.modeles.computer.component.models;

import adbistju.system.modeles.computer.component.enums.RAMType;
import adbistju.system.modeles.computer.component.enums.Socket;

public class MotherBoard {
    private int numberOfSlots;
    private RAMType ramType;
    private float maxMemoryFrequency;
    private float minMemoryFrequency;

    private Socket socketCPU;

    private boolean sataConnection;
    private boolean NVMEConnection;

    private int power;

    private MotherBoard(int numberOfSlots, RAMType ramType, Socket socketCPU, boolean sataConnection, boolean NVMEConnection, int power) {
        this.numberOfSlots = numberOfSlots;
        this.ramType = ramType;
        float max = 0;
        float min = 0;
        if (RAMType.DDR.equals(ramType)){
            max = 600;
            min = 300;
        } else if(RAMType.DDR2.equals(ramType)){
            max = 800;
            min = 600;
        } else if(RAMType.DDR3.equals(ramType)){
            max = 2000;
            min = 1200;
        } else if(RAMType.DDR4.equals(ramType)) {
            max = 4000;
            min = 3000;
        } else {
            throw new IllegalArgumentException();
        }
        this.maxMemoryFrequency = max;
        this.minMemoryFrequency = min;
        this.socketCPU = socketCPU;
        this.sataConnection = sataConnection;
        this.NVMEConnection = NVMEConnection;
        this.power = power;
    }

    public int getNumberOfSlots() {
        return numberOfSlots;
    }

    public RAMType getRamType() {
        return ramType;
    }

    public float getMaxMemoryFrequency() {
        return maxMemoryFrequency;
    }

    public float getMinMemoryFrequency() {
        return minMemoryFrequency;
    }

    public Socket getSocketCPU() {
        return socketCPU;
    }

    public boolean isSataConnection() {
        return sataConnection;
    }

    public boolean isNVMEConnection() {
        return NVMEConnection;
    }

    public int getPower() {
        return power;
    }

    public static MotherBoard createPddr(){
        return new MotherBoard(4,RAMType.DDR4, Socket.LGA1200,true,true,10);
    }

    public static MotherBoard createP(){
        return new MotherBoard(2,RAMType.DDR3, Socket.LGA1200,true,true,10);
    }

    public static MotherBoard createP8b75(){
        return new MotherBoard(4,RAMType.DDR3, Socket.LGA1155,true,false,20);
    }

    public static MotherBoard createP8z77(){
        return new MotherBoard(4,RAMType.DDR3, Socket.LGA1155,true,true,20);
    }

    public static MotherBoard createP5b(){
        return new MotherBoard(2,RAMType.DDR3, Socket.LGA775,true,false,20);
    }

    public static MotherBoard createP5l(){
        return new MotherBoard(4,RAMType.DDR, Socket.LGA775,true,false,10);
    }

    public static MotherBoard createP5kpl(){
        return new MotherBoard(2,RAMType.DDR2, Socket.LGA775,true,false,10);
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "numberOfSlots=" + numberOfSlots +
                ", ramType=" + ramType +
                ", maxMemoryFrequency=" + maxMemoryFrequency +
                ", minMemoryFrequency=" + minMemoryFrequency +
                ", socketCPU=" + socketCPU +
                ", sataConnection=" + sataConnection +
                ", NVMEConnection=" + NVMEConnection +
                '}';
    }
}
