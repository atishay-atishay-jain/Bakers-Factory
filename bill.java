public class bill extends chocolate_cake
{
public static void main(String args[])
{


        bill b = new bill();
	
		
		b.prepare_batter();
		b.add_flour();
		b.add_sugar();
		b.add_flavour();
		b.add_condensed_milk();
		b.add_baking_powder_and_soda();
		b.mix();
		b.prepare_tin();
	        b.bake();

   
	Add_ons add_on=new chocolate_cake();
	add_on=new strawberry_shake(add_on);
		
	System.out.println("the prize of  "+add_on.get_name());
	System.out.println(" is Rs "+add_on.get_price());
	
}
}