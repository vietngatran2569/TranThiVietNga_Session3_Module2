package quadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a: ");
        int a = sc.nextInt();
        System.out.println("input b: ");
        int b = sc.nextInt();
        System.out.println("input c: ");
        int c = sc.nextInt();
        QuadraticEquation qua = new QuadraticEquation(a, b, c);
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("PT co vo so nghiem");
                } else {
                    System.out.println("PT VO NGHIEM");
                }
            } else {
                System.out.println("pt co nghiem duy nhat: " + (-c/b));
            }
        } else {
            if (qua.getDiscriminant() < 0) {
                System.out.println("PT VO NGHIEM");
            } else if (qua.getDiscriminant() == 0) {
                System.out.println("Pt co nghiem kep: " +qua.getDoupleRoot());
            } else {
                System.out.println("Pt co 2 nghiem: " + qua.getRoot1() + " va " + qua.getRoot2());
            }
        }
    }
}
