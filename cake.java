abstract public class cake
{

	public final void template_method()
	{
		prepare_batter();
		add_flour();
		add_sugar();
		add_flavour();
		add_condensed_milk();
		add_baking_powder_and_soda();
		mix();
		prepare_tin();
	        bake();
		
	}
	
	public void prepare_batter()
	{
		System.out.println("preparing batter for cake ");
	}
	
	public void add_flour()
	{
		System.out.println("add 200 gm of refined flour");
	}
	public void add_sugar()
	{
		System.out.println("add 1 cup of powdered sugar");
	}
	
	abstract public void add_flavour();
	
	
	 public void add_condensed_milk() 
		{
		System.out.println("add 200 ml of condensed milk");
		}

	public void add_baking_powder_and_soda()
	{
		System.out.println("add 1/2  tsp of baking powder and soda");
	}
	
	public void mix()
	{
		System.out.println("mix the batter and add milk as needed ");
	}
	
	
	public void prepare_tin()
	{
		System.out.println("prepare the tin and add batter");
	
	}
	public void bake()
	{
		System.out.println("cake is getting ready in oven at 200 deg ");
	}
}