package Java_basic;

class splchar
{
	public static void main(String [] args)
	{
	char ch='a';//98
	String res= ch+ " is a special character";
	if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z') || (ch>='0' && ch<='9'))
	{
		System.out.println(ch + " is not a special character");
	}
	System.out.println(res);
	}
}