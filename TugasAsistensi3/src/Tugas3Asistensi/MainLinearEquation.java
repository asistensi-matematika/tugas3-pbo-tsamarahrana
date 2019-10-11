package Tugas3Asistensi;

import java.util.Scanner;

/**
 *
 * @author tsamarahrana
 */
public class MainLinearEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the numbers : ");
        double a,b,c,d,e,f;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        
        LinearEquation p1 = new LinearEquation(a,b,c,d,e,f);
        p1.printInfo();
        p1.Hasil();
    }
    
}
