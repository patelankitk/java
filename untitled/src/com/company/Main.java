package com.company;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Binary();
    }

    public static  void Pyramid()
    {

        System.out.println("Please enter a number:");
        Scanner UserInput = new Scanner(System.in);
        int n = UserInput.nextInt();
        for (int i = 0; i <n; i++)
        {
            for (int j = 1; j < n - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++)
            {
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }

    }

    public static void Binary()
    {
        System.out.println("Please Enter a binary number");
        Scanner UserInput = new Scanner(System.in);
        String input = UserInput.next();
        char [] Array = input.toCharArray();
        int sum=0;
        int n = Array.length-1;
        for (int i=0; i<Array.length;i++)
        {
            //System.out.println(Array[i]);
            sum = sum + ( (int)Array[i] -48 ) * (int) Math.pow (2,n);
            n--;

        }
        System.out.println(sum);

    }


}
