package application;

import java.util.Locale;
import java.util.Scanner;
import entities.retangle;
public class Retangle0 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        retangle ret = new retangle();
        System.out.println("Enter retangle width and height: ");
        ret.width = sc.nextDouble();
        ret.height = sc.nextDouble();

        System.out.printf("Area = %.2f",ret.area());
        System.out.println();
        System.out.printf("Perimeter = %.2f", ret.perimeter());
        System.out.println();
        System.out.printf("Diagonal = %.2f", ret.diagonal());
    }
}