import java.util.*;
public class UserRegistration
{
	Scanner sc=new Scanner(System.in);
	public void validFirstName()
	{
		System.out.println("Enter the Name");
		String name=sc.next();
		String regex="^[A-Z][a-z]{2,}";
		if(name.matches(regex))
			System.out.println("Name is correct.");
		else
			System.out.println("Name is Incorrect.");
	}
	public static void main(String args[])
	{
	UserRegistration user=new UserRegistration();
	user.validFirstName();
	}
}
