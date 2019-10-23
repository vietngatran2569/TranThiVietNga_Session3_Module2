package fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int spead = SLOW;
    private boolean on=false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public Fan(int spead, boolean on, double radius, String color) {
        this.spead = spead;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpead() {
        return spead;
    }

    public void setSpead(int spead) {
        this.spead = spead;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(){
        if (this.on){
            return "Fan is on "+this.getSpead()+ " "+ this.color+" "+this.radius;
        }else {
            return "Fan is off "+this.color+" "+this.radius;
        }
    }



}
