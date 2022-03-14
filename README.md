# Mario2

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);



        int h = 0;
        System.out.println("What is the height of the pyramid? ");
        h = key.nextInt();

        while (h < 1 || h > 8)
        {
            System.out.println("The height must be a whole number between one and eight. Try again: ");
            h = key.nextInt();
        }

        for (int i = 1; i <= h; i++)
        {
            // print left pyramid

           for (int s = 0; s < h - i ; s++)
            {
               System.out.print(" ");
            }

            for (int x = 1; x <= i; x++)
            {

                System.out.print("#");

            }

            // gap
            System.out.print("  ");

            // print right pyramid

            for (int x = 1; x <= i; x++)
            {
                System.out.print("#");
            }

            // move to new line
            System.out.print("\n");
        }

    }}
