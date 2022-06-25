class MotorVehicals implements Vehicle
{
	String name;
	String color;
	int number;
	double fuelcon;
	void setData(String name,String color,int number,double fuelcon)
	{
		this.name=name;
		this.color=color;
		this.number=number;
		this.fuelcon=fuelcon;
	}
	public String getName()
	{
		return name;
	}
	public String getColor()
	{
		return color;
	}
	public int getNumbers()
	{
		return number;
	}
	public double getConsumption()
	{
		return fuelcon;
	}
}