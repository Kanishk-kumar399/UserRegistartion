import java.util.*;
public class UserRegistration
{
	Scanner sc=new Scanner(System.in);
	public void validLastName()
	{
		System.out.println("Enter the Last Name");
		String name=sc.next();
		String regex="^[A-Z][a-z]{2,}";
		if(name.matches(regex))
			System.out.println("Last Name is correct.");
		else
			System.out.println("Last Name is Incorrect.");
	}
	public static void main(String args[])
	{
	UserRegistration user=new UserRegistration();
	user.validLastName();
	}
}
