package Java_basic;

class GSTCalculation
{
	public static void main(String [] args)
	{
	double price = 199.9;
	double gst = 5;
	double gstamount = (price*gst)/100;
	double finalprice = price + gstamount;
	System.out.println("Price -- Rs. " + price);
	System.out.println("GST -- " + gst + "%");
	System.out.println("GST amount -- Rs. " + gstamount);
	System.out.println("Final price -- Rs. " + finalprice); 
	}
}