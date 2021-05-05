class strawberry_shake extends decorator
{
        strawberry_shake(Add_ons add_on)
	{
		this.add_on=add_on;
	}
	
		
	public String get_name()
	{
		return add_on.get_name()+" with strawberry shake ";
	}
	
	public int get_price()
	{
		return add_on.get_price()+80;
	}
}