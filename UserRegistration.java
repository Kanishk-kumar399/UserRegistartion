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
	public void validMobileNumber()
	{
		System.out.println("Enter the Mobile Number");
		sc.nextLine();
		String mobNumber=sc.nextLine();
		String regex="^(\\d{2})\\s{1}\\d{10}";
		if(mobNumber.matches(regex))
			System.out.println("Mobile Number is correct.");
		else
			System.out.println("Mobile Number is Incorrect.");
	}
	public void validPassword()
	{
		System.out.println("Enter the Password");
		String password=sc.nextLine();
		String regex="(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9 ]).{8,}";
		if(password.matches(regex))
			System.out.println("Password is correct.");
		else
			System.out.println("Password is Incorrect.");
	}
	public void checkMultipleEmail()
	{
	String regex="[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
	ArrayList<String> email=new ArrayList<String>();
	email.add("abc@yahoo.com");
	email.add("abc-100@yahoo.com");
	email.add("abc.100@yahoo.com");
	email.add("abc111@abc.com");
	email.add("abc-100@abc.net");
	email.add("abc.100@abc.com.au");
	email.add("abc@1.com");
	email.add("abc@gmail.com.com");
	email.add("abc+100@gmail.com");
	email.add("abc");
	email.add("abc@com.my");
	email.add("abc123@gmail.a");
	email.add("abc123@.com.com");
	email.add("abc@%*.com");
	email.add("abc@gmail.com.aa.uu");
	email.add("abc@gmail.com.1a");
	email.add("abc..2002@gmail.com");
	email.add("abc()*@gmail.com");
	email.add(".abc@gmail.com");
	for(String i:email)
		{
		if(i.matches(regex))
		System.out.println("True");
		else
		System.out.println("False");
		}
	}
	public static void main(String args[])
	{
	UserRegistration user=new UserRegistration();
	user.validFirstName();
	user.validLastName();
	user.validEmail();
	user.validMobileNumber();
	user.validPassword();
	UserRegistration email=new UserRegistration();
	email.checkMultipleEmail();
	}
}
