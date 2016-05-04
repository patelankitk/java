package Day2.AddressBook;

import Arrays.Array;
import sun.font.TrueTypeFont;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student on 04-May-16.
 */



public class Registration {
    public static void main (String [] args)
    {
        Registration r = new Registration();
        r.RegisterUser();
        r.AddPerson();
        r.DisplayList();
    }


    private List<Person> PersonList = new ArrayList<Person>();

    public void AddPerson()
    {
        Person Phil = new Person("Phil", "Smith", "Male", 45, 183, false, true);
        PersonList.add(Phil);

        Person Victoria  = new Person("Victoria", "Beckham", "Female", 35, 150, true, true);
        PersonList.add(Victoria);

        Person David  = new Person("David", "Beckham", "Male", 30, 160, false, true);
        PersonList.add(David);
    }

    public  void RegisterUser()
    {
        Scanner UserInput = new Scanner(System.in);


        System.out.println("Please enter the first name : ");
        String fn = UserInput.nextLine();

        System.out.println("Please enter the last name : ");
        String ln = UserInput.nextLine();

        System.out.println("Please enter your gender(Male or Female): ");
        String gender = UserInput.nextLine();


        System.out.println("Please enter your age: ");
        int age = UserInput.nextInt();

        System.out.println("Please enter your height): ");
        double height = UserInput.nextDouble();

        System.out.println("Smoker..? (True / False): ");
        boolean smoker = UserInput.nextBoolean();

        System.out.println("Available..? (True / False): ");
        boolean available = UserInput.nextBoolean();

        Person p1 = new Person(fn,ln,gender,age,height,smoker,available);
        PersonList.add(p1);

        List<Person> personList = PersonList;
    }


    public void DisplayList()
    {
        for ( Person p: PersonList)
        {
            System.out.println(p);
        }
    }

    public List<Person> ReturnList()
    {

        AddPerson();
        List<Person> personList = PersonList;
        return personList;

    }


}
