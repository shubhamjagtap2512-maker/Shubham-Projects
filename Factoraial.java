class Factoraial 
{
	public static void main(String [] args)
	{
		System.out.println(fact(5));
	}
	public static int fact(int num) 
	{
        int fact=1;
		 
		 while (num!=0)
		 {
			 fact*=num;
			 num--;
		 }
		 return fact;
	}
}
