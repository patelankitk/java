package Day2.AddressBook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 04-May-16.
 */
public class Person {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private double height;
    private boolean smoker;
    private boolean available;


//Constructor
    public Person()
    {
        firstName = "No First Name";
        lastName = "No Last Name";
        available = true;
    }
// overloading constructor
    public Person(String firstName,String lastName)
    {
        this.firstName = firstName;
        this.lastName=lastName;
    }
//overloading constructor
    public Person( String fn, String ln, String gender,int age,double height,boolean smoker,boolean available)
    {
        this(); //invokes the default constructor
        this.firstName = fn;
        this.lastName=ln;
        this.gender=gender;
        this.age=age;
        this.height=height;
        this.smoker=smoker;
        this.available=available;
    }
//getset method for Gender
    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}
//getset method for age
    public void setAge(int age) {this.age = age;}
    public int getAge() {return age;}
//getset method for height
    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}
//getset method for available
    public boolean getAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
//getsetmethod for smoker
    public boolean isSmoker() {return smoker;}
    public void setSmoker(boolean smoker) {this.smoker = smoker;}
//getset method for  lastname
    public void setLastName(String lastName) {this.lastName = lastName;}
    public String getLastName(){return lastName;}
//getset method for firstname
    public String getFirstName(){return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}


    //method to set name
    public void setName(String fn, String ln)
    {
        this.firstName = fn;
        this.lastName=ln;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", smoker=" + smoker +
                ", available=" + available +
                '}';
    }
}
