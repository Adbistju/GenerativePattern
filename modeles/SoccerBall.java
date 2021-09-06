package adbistju.system.modeles;

public class SoccerBall {
    private String form;
    private Long circumference;
    private int size;
    private float weight;
    private float pressure;

    private SoccerBall(String form, Long circumference, int size, float weight, float pressure) {
        this.form = form;
        this.circumference = circumference;
        this.size = size;
        this.weight = weight;
        this.pressure = pressure;
    }

    public static SoccerBall buildSoccerBall(){
        String form = "sphere";
        Long circumference = 70l;
        int size = 5;
        float weight = 0.450f;
        float pressure = 1f;
        return new SoccerBall(form,circumference,size,weight,pressure);
    }

    public String getForm() {
        return form;
    }

    public Long getCircumference() {
        return circumference;
    }

    public int getSize() {
        return size;
    }

    public float getWeight() {
        return weight;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public String toString() {
        return "SoccerBall{" +
                "form='" + form + '\'' +
                ", circumference=" + circumference +
                ", size=" + size +
                ", weight=" + weight +
                ", pressure=" + pressure +
                '}';
    }
}
