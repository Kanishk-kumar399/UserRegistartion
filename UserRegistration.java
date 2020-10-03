import java.util.*;
public class UserRegistration
{
	Scanner sc=new Scanner(System.in);
	public void validMobileNumber()
	{
		System.out.println("Enter the Mobile Number");
		String mobNumber=sc.nextLine();
		String regex="^(\\d{2})\\s{1}\\d{10}";
		if(mobNumber.matches(regex))
			System.out.println("Mobile Number is correct.");
		else
			System.out.println("Mobile Number is Incorrect.");
	}
	public static void main(String args[])
	{
	UserRegistration user=new UserRegistration();
	user.validMobileNumber();
	}
}
