package Arrays;

/**
 * Created by student on 03-May-16.
 */
public class Array {

    public static void main (String [] args)
    {
        int [] numbers = {1,2,2,1,13};
        int [][] twoD = new int [][]{{1,2,3},{7,3,3,3}};
       // twoD.


        //SameFirstLast(numbers);
        System.out.println(sum13(numbers));
    }

    public static boolean firstLast6( int[] num)
    {
        return (num[0] ==6 || num[num.length-1]==6);
    }

    public static boolean sameFirstLast(int [] num)
    {
        return (num.length>=1 && (num[0]== num[num.length-1]));
    }

    public static boolean commonEnd(int [][] TwoD)
    {
        //System.out.println(TwoD[0].length);
        return((TwoD [0][0]==TwoD[1][0]) || (TwoD[0][TwoD[0].length-1] == TwoD[1][TwoD[1].length-1 ]));

    }
    public static void maxEnd3(int [] num)
    {
        if (num [0]> num[2])
            for (int i=0; i<num.length;i++) {

                num[i] = num[0];

            }
        else if (num [0]< num[2])
            for (int i=0; i<num.length;i++) {

                num[i] = num[2];

        }


        for (int j=0; j<num.length;j++)
            System.out.println(num[j]);

    }

    public static boolean has23(int[] num)
    {
        return ((num[0]==2 || num[0]==3) ||( num [1]==2 || num [1]==3));
    }


    public static int EvenNumber(int [] num)
    {
        int count = 0;
        for (int i=0; i<num.length;i++)
        {
            if ((num[i]%2 )==0)
            {
                count++;
            }
        }
        return count;
    }

    public static int bigDiff(int [] num)
    {
        int larger = 0;
        int smaller = num[0];

        for (int i=0; i<num.length;i++)
        {
            larger = Math.max(larger,num[i]);
            smaller =Math.min(smaller,num[i]);
        }

        return larger - smaller;
    }

    public static int sum13(int [] num)
    {
        int sum=0;
        for (int i=0;i<num.length;i++)
        {
            if(num [i]==13)
            {
                continue;
            }
            else {
                sum = sum + num[i];
            }
        }
        return sum;
    }

    public static int sum67(int [] num)
    {
        int sum=0;
        for (int i=0;i<num.length;i++)
        {

            if(num [i]==6)
            {

                continue;
            }
            else {
                sum = sum + num[i];
            }
        }
        return sum;
    }


}
