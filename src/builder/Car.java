package builder;

public class Car {

    private String color;

    private String tyre;

    public void setColor(String color) {
        this.color = color;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", tyre='" + tyre + '\'' +
                '}';
    }
}
