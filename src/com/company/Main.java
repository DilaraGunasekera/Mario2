package com.company;

import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
           // write your code here
        Scanner keyboard = new Scanner(System.in);

        int h;
        do
        {
         System.out.println("Enter a number between 1 and 8: ");
         h= keyboard.nextInt();
        }
        while (h< 1||h >8);
        if ((h>= 1) && (h <= 8));

        {

        for(int i =0; i < h ; i++);
        {
            for (int j =0; j < h; j++);
            {
                System.out.print("#".repeat(h));
            }
        System.out.println("\n");





    }

    }}}

