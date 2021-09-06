package adbistju.system.modeles.computer.component.models;

import adbistju.system.modeles.computer.component.enums.RAMType;

public class RAM {
    private RAMType ramType;
    private float size;
    private float MemoryFrequency;
    private int power;

    public RAM(RAMType ramType, float size, float memoryFrequency, int power) {
        this.ramType = ramType;
        this.size = size;
        MemoryFrequency = memoryFrequency;
        this.power = power;
    }

    public RAMType getRamType() {
        return ramType;
    }

    public float getSize() {
        return size;
    }

    public float getMemoryFrequency() {
        return MemoryFrequency;
    }

    public int getPower() {
        return power;
    }

    public static RAM createKingston1GBDDR400MHz() {
        return new RAM(RAMType.DDR, 1f, 400f, 3);
    }

    public static RAM createKingston512DDR300MHz() {
        return new RAM(RAMType.DDR, 0.512f, 300f, 3);
    }

    public static RAM createSkill256DDR300MHz() {
        return new RAM(RAMType.DDR, 0.256f, 300f, 3);
    }

    public static RAM createSkill512DDR400MHz() {
        return new RAM(RAMType.DDR, 0.512f, 400f, 3);
    }

    public static RAM createSamsung1gbDDR2800MHz() {
        return new RAM(RAMType.DDR2, 1f, 800f, 2);
    }

    public static RAM createSamsung2DDR2800MHz() {
        return new RAM(RAMType.DDR2, 2f, 800f, 2);
    }

    public static RAM createSiliconPower1gbDDR2800MHz() {
        return new RAM(RAMType.DDR2, 1f, 800f, 2);
    }

    public static RAM createSiliconPower2gbDDR2800MHz() {
        return new RAM(RAMType.DDR2, 2f, 800f, 2);
    }

    public static RAM createCrucial2gbDDR31333MHz() {
        return new RAM(RAMType.DDR3, 2f, 1333f, 1);
    }

    public static RAM createCrucial1gbDDR31333MHz() {
        return new RAM(RAMType.DDR3, 1f, 1333f, 1);
    }

    public static RAM createCrucial4gbDDR31600MHz() {
        return new RAM(RAMType.DDR3, 4f, 1600f, 2);
    }

    public static RAM createCrucial8gbDDR31600MHz() {
        return new RAM(RAMType.DDR3, 8f, 1600f, 2);
    }

    public static RAM createSamsung4gbDDR31800MHz() {
        return new RAM(RAMType.DDR3, 4f, 1800f, 2);
    }

    public static RAM createSamsung8gbDDR31800MHz() {
        return new RAM(RAMType.DDR3, 8f, 1800f, 2);
    }

    public static RAM createGigabyte8gbDDR4300Mhz() {
        return new RAM(RAMType.DDR4, 8f, 3000f, 1);
    }

    public static RAM createGigabyte16gbDDR4300Mhz() {
        return new RAM(RAMType.DDR4, 16f, 3000f, 1);
    }

    public static RAM createKingston8gbDDR4320Mhz() {
        return new RAM(RAMType.DDR4, 8f, 3200f, 2);
    }

    public static RAM createKingston16gbDDR4320Mhz() {
        return new RAM(RAMType.DDR4, 16f, 3200f, 2);
    }

    @Override
    public String toString() {
        return "RAM{" +
                "ramType=" + ramType +
                ", size=" + size +
                ", MemoryFrequency=" + MemoryFrequency +
                '}';
    }
}
