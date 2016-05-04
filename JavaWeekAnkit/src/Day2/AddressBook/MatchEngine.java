package Day2.AddressBook;

import Arrays.Array;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by student on 04-May-16.
 */
public class MatchEngine {
    public static void main (String[]args)
    {
        MatchEngine M1 = new MatchEngine();
        M1.Availability("phil");
    }

    Registration R1 = new Registration();



    public void Availability(String firstName)
    {
        List<Person> L1 = new ArrayList<>();
        L1 = R1.ReturnList();
        Contact resultContact = null;

        for (int i=0;i<L1.size();i++)
        {
            Person p = L1.get(i);
            if((p.getFirstName().equalsIgnoreCase(firstName))&& p.getAvailable()==true);
            {
                System.out.println(firstName+ " is available.");
                break;
            }

        }



        /*Person p = L1.get(i);
        if(p.getAvailable().
        for (int i=0;i<L1.size();i++)
        {
            System.out.println(L1.get(i));
        }*/
    }
}
