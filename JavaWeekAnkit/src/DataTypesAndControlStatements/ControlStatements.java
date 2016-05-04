package DataTypesAndControlStatements;

import java.util.Scanner;

/**
 * Created by student on 03-May-16.
 */
public class ControlStatements {

    public static void main (String [] args)
    {
        Binary();
    }

    static void SimpleIf()
    {
        System.out.println("Enter a number ");

        Scanner scan = new Scanner(System.in);
        char number = scan.next().charAt(0);

        if (Character.isLetter(number) || Character.isDigit(number))
        {

            if (Character.isUpperCase(number))
                System.out.println("Your char is upper case");
            else if (Character.isLowerCase(number))
                System.out.println("Your char is lower case");

            else if ( Character.isDigit(number) && number >5)
            {
                System.out.println("your char is a digit and more than 5");
            }

        }

        else {
                System.out.println("Your char is not a number or case");

        }

    }

    static void WhileLoopInfinite()
    {
        System.out.println("Please Enter a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int counter = 0;
        while(counter!=20)
        {

            System.out.println("Please enter correct number to stop the infinite loop.");

            counter = scan.nextInt();


        }

        System.out.println("you got the correct number.");



    }

    static void Pyramid()
    {
        System.out.println("Please enter a number.");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i=1; i<=num;i++)
        {
            System.out.print(num);

        }


        for(int j =1; j<=num-2;j++)
        {
            System.out.print(num);
        }
    }

    static void Binary()
    {
        System.out.println("Please enter a binary number");
        Scanner input =  new Scanner(System.in);
        String binary = input.nextLine();

        char [] Num = binary.toCharArray();


      /* int result = 0, mult = 1;

        for(int i=binary.length()-1;i>=0;i--) {
            if (binary.charAt(i) == '1') {
                result += mult;
            }
            mult = mult * 2;

        }

        System.out.println(result);*/
    }


}
