package Arrays;

import java.util.Scanner;

/**
 * Created by Ankit on 03/05/2016.
 */
public class Pyramid {

    public static void main (String[] args)
    {
        Pyrami();
    }

    public static void Pyrami()
    {
        System.out.println("Please enter a number: ");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n - i; j++)
            {
                System.out.print(" ");
            }
                for (int k = 1; k <= i + 1; k++)
                {
                    System.out.print(k + " ");
                }

                System.out.println();

        }

    }
}
