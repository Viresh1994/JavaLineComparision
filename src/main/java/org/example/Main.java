package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wel Come to Line Comparision Computation Program!");
        double length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (x1,y1) co-ordinates");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter (x1,y1) co-ordinates");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        length = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Length of line is:"+length);
    }
}