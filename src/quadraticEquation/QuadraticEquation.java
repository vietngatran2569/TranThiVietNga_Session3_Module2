package quadraticEquation;

public class QuadraticEquation {
    private int a,b,c;
    public QuadraticEquation(){
    }
    public QuadraticEquation(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public double  getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        return (-this.b -getDiscriminant()) / (2 * this.a);
    }
    public double getRoot2(){
        return (this.b -getDiscriminant()) / (2 * this.a);
    }
    public double getDoupleRoot(){
        return (-this.b / (2 * this.a));
    }

}

