import java.util.*;
public class UserRegistration
{
	Scanner sc=new Scanner(System.in);
	public void validPassword()
	{
		System.out.println("Enter the Password");
		String password=sc.nextLine();
		String regex="(?=.[A-Z]).{8,}";
		if(password.matches(regex))
			System.out.println("Password is correct.");
		else
			System.out.println("Password is Incorrect.");
	}
	public static void main(String args[])
	{
	UserRegistration user=new UserRegistration();
	user.validPassword();
	}
}
