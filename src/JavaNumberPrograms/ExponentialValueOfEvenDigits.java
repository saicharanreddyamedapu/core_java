package JavaNumberPrograms;

import java.util.Scanner;
class  ExponentialValueOfEvenDigits
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Enter the power value");
		int n = sc.nextInt();
		while(num>0)
		{
			int ld = num%10;
			if (ld%2==0){
				int exp=1;
				for (int i=1;i<=n ;i++ )
				{
					exp = exp*ld;
				}
				System.out.println("The exponential value of "+ ld +" power of "+n+" is "+exp);
			}
			num=num/10;
			
		}
	}
}
