package adbistju.system.modeles.computer.component.models;

import adbistju.system.modeles.computer.component.enums.ConnectionTypeDataStorage;

public class DataStorage{
    private ConnectionTypeDataStorage connectionType;
    private float size;
    private int power;

    private DataStorage() {
    }

    private DataStorage(ConnectionTypeDataStorage connectionType, float size, int power) {
        this.connectionType = connectionType;
        this.size = size;
        this.power = power;
    }

    public ConnectionTypeDataStorage getConnectionType() {
        return connectionType;
    }

    public float getSize() {
        return size;
    }

    public int getPower() {
        return power;
    }

    public static DataStorage createHDDseageate300() {
        return new DataStorage(ConnectionTypeDataStorage.SATA,300,20);
    }

    public static DataStorage createHDDWD1000() {
        return new DataStorage(ConnectionTypeDataStorage.SATA,1000,25);
    }

    public static DataStorage createHDDWD3000() {
        return new DataStorage(ConnectionTypeDataStorage.SATA,3000,25);
    }

    public static DataStorage createSDDnvmeKingston500() {
        return new DataStorage(ConnectionTypeDataStorage.NVME,500,5);
    }

    public static DataStorage createSDDKingston500() {
        return new DataStorage(ConnectionTypeDataStorage.SATA,500,5);
    }

    public static DataStorage createSDDSamsung500() {
        return new DataStorage(ConnectionTypeDataStorage.NVME,500,6);
    }

    public static DataStorage createSDDnvmePleztor250() {
        return new DataStorage(ConnectionTypeDataStorage.NVME,250,3);
    }

    @Override
    public String toString() {
        return "DataStorage{" +
                "connectionType=" + connectionType +
                ", size=" + size +
                '}';
    }
}
