package adbistju.system.modeles.computer.component.models;

public class PowerBox {
    private int power;

    private PowerBox(int power) {
        this.power = power;
    }

    public static PowerBox buildPowerBox(int power){
        return new PowerBox(power);
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "PowerBox{" +
                "power=" + power +
                '}';
    }
}
