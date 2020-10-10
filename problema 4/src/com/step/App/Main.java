package com.step.App;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);




        System.out.println("Introduceti lungimea tabloului:");
        int n=sc.nextInt();
        char[] tablou = new char[n];


        for (int i = 0; i <n ; i++) {


            System.out.println("Introduceti arrayul "+ (i+1) +" :");

            tablou[i]=sc.next().charAt(0);

        }

        for (int i = 0; i <n ; i++) {


            if(tablou[i]=='a'|| tablou[i]=='e'|| tablou[i]=='i'|| tablou[i]=='o'|| tablou[i]=='u')
            {
                System.out.println("Elementul "+ (i+1) +"= "+tablou[i]+" este vocala");
            }
            else
            {
                System.out.println("Elementul "+ (i+1) +"= "+tablou[i]+" este consoana");
            }

        }




    }
}
