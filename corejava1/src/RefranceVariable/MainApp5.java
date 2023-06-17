package RefranceVariable;

//static  --single copy
//non-static ---multiple copy
class Meter
{
	static int mainReading=0;
	       int tripReading=0;
     void calculateReading(int reading)
	{
		mainReading=mainReading+reading;
		tripReading=reading;
	}
}
class MainApp5  
{
	public static void main(String[] args) 
	{
		Meter m1=new Meter();
		m1.calculateReading(100);
		System.out.println("MAIN READING IS :"+Meter.mainReading);
		System.out.println("TRIP READING IS :"+m1.tripReading);
        
		Meter m2=new Meter();
		m2.calculateReading(300);
		System.out.println("MAIN READING IS :"+Meter.mainReading);
		System.out.println("TRIP READING IS :"+m2.tripReading);		
	}
}
