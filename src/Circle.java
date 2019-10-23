public class Circle {
    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return Math.PI*2*this.radius;
    }
    public String toString(){
        return "Im circle,my radius is: "+this.radius;
    }

}
