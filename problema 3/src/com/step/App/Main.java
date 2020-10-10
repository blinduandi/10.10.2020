package com.step.App;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);




        System.out.println("Introduceti lu4gimea tabloului:");
        int n=sc.nextInt();
        int[] tablou = new int[n];
        int max=-2147483648,min=2147483647;

        for (int i = 0; i <n ; i++) {


            System.out.println("Introduceti arrayul "+ (i+1) +" :");

            tablou[i]=sc.nextInt();

            if(max<=tablou[i]) {

            max=tablou[i];
            }

            if(min>=tablou[i]) {

                min=tablou[i];
            }


            }



        for (int i = 0; i < n ; i++) {

            System.out.println("Elementul "+ (i+1) +"= "+tablou[i]);

        }

        System.out.println("Maximul este:"+max);
        System.out.println("Minimul este:"+min);

    }
}
