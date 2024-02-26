import java.util.Scanner;//the program has not finished
class DirObj 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Con ob=new Con();
		System.out.println("enter username:");
		ob.uName=s.nextLine();
		System.out.println("enter address:");
		ob.addr=s.nextLine();
		System.out.println("enter code:");
		ob.code=s.nextInt();
		System.out.println("enter password:");
		ob.pass=s.nextLine();
		System.out.println("enter price:");
		ob.price=s.nextFloat();
		ob.dis();
	}
}
class Con
{
	String uName,addr;
	String pass;
	int code;
	float price;
 void dis()
	{
		System.out.println("the username:"+uName);
	System.out.println("addr:"+addr);
	System.out.println("the user code:"+code);
	System.out.println("the user password:"+pass);
	System.out.println("the price of the user's book:"+price);
	}
}
