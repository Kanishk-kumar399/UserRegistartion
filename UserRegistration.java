import java.util.*;
public class UserRegistration
{
	Scanner sc=new Scanner(System.in);
	public void validEmail()
	{
		System.out.println("Enter the EmailId");
		String emailId=sc.next();
		String regex="[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
		if(emailId.matches(regex))
			System.out.println("EmailId is correct.");
		else
			System.out.println("EmailId is Incorrect.");
	}
	public static void main(String args[])
	{
	UserRegistration user=new UserRegistration();
	user.validEmail();
	}
}
