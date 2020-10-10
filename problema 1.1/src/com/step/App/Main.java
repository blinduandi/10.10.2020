package com.step.App;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);




        System.out.println("Introduceti lu4gimea tabloului:");
        int n=sc.nextInt();
        int[] tablou = new int[n];
        int sum=0;

        for (int i = 0; i <n ; i++) {


            System.out.println("Introduceti arrayul "+ (i+1) +" :");

             tablou[i]=sc.nextInt();
             sum=sum+tablou[i];
        }

        for (int i = 0; i <n ; i++) {

            System.out.println("Elementul "+ (i+1) +"= "+tablou[i]);

        }

        System.out.println("Suma este:"+sum);



    }
}
