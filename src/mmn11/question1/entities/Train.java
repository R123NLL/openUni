package mmn11.entities;

public class Train {
    private String name;
    private int speed;
    private int departureTime;
    private int arrivalTime;

    public Train() {

    }

    public Train(String name, int speed, int departureTime, int arrivalTime) {
        this.name = name;
        this.speed = speed;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String toString() {
        return "Train{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
