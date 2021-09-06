package adbistju.system;

import adbistju.system.modeles.computer.component.Computer;
import adbistju.system.modeles.computer.component.models.*;

public class Main{
    public static void main(String[] args) {
        CPU cpu = CPU.createIntelI511600kf();
        RAM ram = RAM.createSamsung1gbDDR2800MHz();
        DataStorage dataStorage = DataStorage.createHDDseageate300();
        MotherBoard motherBoard = MotherBoard.createP5kpl();
        PowerBox powerBox = PowerBox.buildPowerBox(100);

        Computer computer = Computer.createComputer(motherBoard,ram, cpu,dataStorage,powerBox);
        System.out.println(computer);

        System.out.println("-----------------------------");
        create1();
    }

    public static void create1(){
        CPU cpu = CPU.createIntelI511600kf();
        RAM ram = RAM.createGigabyte16gbDDR4300Mhz();
        DataStorage dataStorage = DataStorage.createSDDnvmePleztor250();
        MotherBoard motherBoard = MotherBoard.createPddr();
        PowerBox powerBox = PowerBox.buildPowerBox(200);

        Computer computer = Computer.createComputer(motherBoard,ram, cpu,dataStorage,powerBox);
        System.out.println(computer);
    }
}
