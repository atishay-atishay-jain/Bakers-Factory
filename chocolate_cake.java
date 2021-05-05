public class chocolate_cake extends cake implements Add_ons
{
	public void add_flavour()
	{
		System.out.println("add 3 tbsp of cocoa powder");
	}
		
	public int get_price()
	{
		return 280;
	}
	
	public String get_name()
	{
		return "chocolate cake";
	}
}