package adbistju.system.modeles.computer.component;

import adbistju.system.modeles.computer.component.enums.ConnectionTypeDataStorage;
import adbistju.system.modeles.computer.component.models.*;

public class Computer {
    private MotherBoard motherBoard;
    private RAM ram;
    private CPU cpu;
    private DataStorage dataStorage;
    private PowerBox powerBox;

    private Computer(MotherBoard motherBoard, RAM ram, CPU cpu, DataStorage dataStorage, PowerBox powerBox) {
        this.motherBoard = motherBoard;
        this.ram = ram;
        this.cpu = cpu;
        this.dataStorage = dataStorage;
        this.powerBox = powerBox;
    }

    public static Computer createComputer(MotherBoard motherBoard, RAM ram, CPU cpu, DataStorage dataStorage, PowerBox powerBox){
        int errors = 0;
        if(!motherBoard.getSocketCPU().equals(cpu.getSocket())){
            System.out.println("сокет процессора не подходит");
            errors++;
        } else {
            System.out.println("ok");
        }
        if(!motherBoard.getRamType().equals(ram.getRamType())){
            System.out.println("тип оперативной памяти не подходит");
            errors++;
        } else {
            System.out.println("ok");
        }
        if(motherBoard.isNVMEConnection() && motherBoard.isSataConnection() && dataStorage.getConnectionType().equals(ConnectionTypeDataStorage.NVME)){
            System.out.println("ok");
        } else if(motherBoard.isNVMEConnection() && motherBoard.isSataConnection() && dataStorage.getConnectionType().equals(ConnectionTypeDataStorage.SATA)){
            System.out.println("ok");
        } else if(!motherBoard.isNVMEConnection() && motherBoard.isSataConnection() && dataStorage.getConnectionType().equals(ConnectionTypeDataStorage.NVME)){
            System.out.println("постоянное хранилище данных не может подсоединиться из за разницы разъемов");
            errors++;
        } else if(motherBoard.isNVMEConnection() && !motherBoard.isSataConnection() && dataStorage.getConnectionType().equals(ConnectionTypeDataStorage.SATA)){
            System.out.println("постоянное хранилище данных не может подсоединиться из за разницы разъемов");
            errors++;
        }
        int power = motherBoard.getPower()+ cpu.getPower()+ ram.getPower()+ dataStorage.getPower();
        if(!(powerBox.getPower()-power >= 0)){
            System.out.println("мощности блока питания не достаточно");
            errors++;
        } else {
            System.out.println("ok");
        }
        if (errors > 0){
            System.out.println("Компьютер не собрался");
            return null;
        } else {
            return new Computer(motherBoard,ram,cpu,dataStorage,powerBox);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "motherBoard=" + motherBoard.toString() +
                ", ram=" + ram.toString() +
                ", cpu=" + cpu.toString() +
                ", dataStorage=" + dataStorage.toString() +
                ", powerBox=" + powerBox.toString() +
                '}';
    }
}
