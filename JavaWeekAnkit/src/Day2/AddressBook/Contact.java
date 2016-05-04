package Day2.AddressBook;

/**
 * Created by student on 04-May-16.
 */
public class Contact extends Person
{
    private String firstName;
    private String lastName;
    private Address address;
    private String phoneNumber;
    private String email;
    private String twitterAccount;
    private String facebookLink;

    public Contact(String firstName, String lastName,String phoneNumber, Address address ,String email,String twitterAccount,String facebookLink)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNumber=phoneNumber;
        this.address=address;
        this.email=email;
        this.twitterAccount=twitterAccount;
        this.facebookLink=facebookLink;
    }

   /* public Contact(String firstName, String lastName, Address address)
    {
        super(firstName,lastName);
        this.address=address;
    }*/

    @Override
    public String toString()
    {
        return " FirstName: "+firstName+" LastName: "+lastName +" Phone Number: "+ phoneNumber + " "+ address + " Email: "+ email + " TwitterAccount "+twitterAccount + " Facebook: "+facebookLink;
    }

}
