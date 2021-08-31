public class EvenOrOdd
{
public static void main(String[] arg)
{


	int number;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	number=sc.nextInt();

	if(number%2==0)
	{
		System.out.println("NUmber is Even");
	}
	else
	{
		System.out.println("NUmber is odd");	

	}

}
}