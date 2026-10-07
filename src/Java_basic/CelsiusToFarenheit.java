package Java_basic;

class CelsiusToFarenheit
{
	public static void main(String [] args)
	{
	double tempc = 38.2;
	System.out.println("Temperature in celsius is " + tempc + "°C");
	double tempf = (tempc*9/5)+32;
	System.out.println("Temperature in farenheit is " + tempf +"F");
	}
}