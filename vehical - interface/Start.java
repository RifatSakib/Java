class Start
{
	public static void main(String args[])
	{
	MotorVehicals ob=new MotorVehicals();
	ob.setData("Splendour","Black Blue",1490,500.12);
	String name=ob.getName();
	String color=ob.getColor();
	int num=ob.getNumbers();
	double cons=ob.getConsumption();
	System.out.println("\n Name : "+name+"\n Color : "+color+"\n Number : "+num+"\n Consumption : "+cons);
	Bikes ob1=new Bikes();
	ob1.setData("Buggatti","Vibrant Red",9900,80000);
	 name=ob1.getName();
	 color=ob1.getColor();
	 num=ob1.getNumbers();
	 cons=ob1.getConsumption();
	System.out.println("\n Name : "+name+"\n Color : "+color+"\n Number : "+num+"\n Consumption : "+cons);
	}
	


}


