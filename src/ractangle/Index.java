package ractangle;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width1 = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height1 = scanner.nextDouble();

        Ractangle rectangle=new Ractangle(width1,height1);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
