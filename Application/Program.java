package Application;

import Entities.calculator;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        calculator calc = new calculator();

        System.out.println("enter radius: ");

        double radius = entrada.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);

        System.out.println("Radius: %2.f%n" + radius);
        System.out.println("Radius: %2.f%n" + c);
        System.out.println("volume: %2.f%n" + v);


        entrada.close();
    }
}