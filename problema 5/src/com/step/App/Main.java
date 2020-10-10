package com.step.App;

import java.util.Scanner;

public class Main {

    public int sum(int a, int b)
    {
        return (a+b);
    }

    public double sum(int a, double b)
    {
        return (a+b);
    }

    public int scaderea(int a, int b)
    {
        return (a-b);
    }

    public double scaderea(int a, double b)
    {
        return (a-b);
    }
    public int impartirea(int a, int b)
    {
        return (a/b);
    }

    public double impartirea(int a, double b)
    {
        return (a/b);
    }

    public int inmultirea(int a, int b)
    {
        return (a*b);
    }

    public double inmultirea(int a, double b)
    {
        return (a*b);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a,b;
        double c;

	Main calc = new Main();

        System.out.println("Introdu a:");
        a= sc.nextInt();
        System.out.println("Introdu b:");
        b= sc.nextInt();

	    System.out.println("Suma:"+calc.sum(a,b));

        System.out.println("Introdu a:");
        a= sc.nextInt();
        System.out.println("Introdu b:");
        c= sc.nextDouble();

	    System.out.println("Suma:"+calc.sum(a,c));

        System.out.println("Introdu a:");
        a= sc.nextInt();
        System.out.println("Introdu b:");
        b= sc.nextInt();

        System.out.println("Scaderea:"+calc.scaderea(a,b));

        System.out.println("Introdu a:");
        a= sc.nextInt();
        System.out.println("Introdu b:");
        c= sc.nextDouble();

        System.out.println("Scaderea:"+calc.scaderea(a,c));

        System.out.println("Introdu a:");
        a= sc.nextInt();
        System.out.println("Introdu b:");
        b= sc.nextInt();

        System.out.println("Impartirea:"+calc.impartirea(a,b));

        System.out.println("Introdu a:");
        a= sc.nextInt();
        System.out.println("Introdu b:");
        c= sc.nextDouble();

        System.out.println("Impartirea:"+calc.impartirea(a,c));

        System.out.println("Introdu a:");
        a= sc.nextInt();
        System.out.println("Introdu b:");
        b= sc.nextInt();

        System.out.println("Inmultirea:"+calc.inmultirea(a,b));

        System.out.println("Introdu a:");
        a= sc.nextInt();
        System.out.println("Introdu b:");
        c= sc.nextDouble();

        System.out.println("Inmultirea:"+calc.inmultirea(a,c));

    }
}
