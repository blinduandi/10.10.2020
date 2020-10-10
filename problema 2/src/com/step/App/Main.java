package com.step.App;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);




        System.out.println("Introduceti lu4gimea tabloului:");
        int n=sc.nextInt();
        int[] tablou = new int[n];


        for (int i = 0; i <n ; i++) {


            System.out.println("Introduceti arrayul "+ (i+1) +" :");

            tablou[i]=sc.nextInt();

        }

        for (int i = 0; i <n ; i++) {

            System.out.println("Elementul "+ (i+1) +"= "+tablou[i]);

        }


        for (int i = n-1; 0 <= i ; i--) {

            System.out.println("Elementul "+ (i+1) +"= "+tablou[i]);

        }



    }
}
