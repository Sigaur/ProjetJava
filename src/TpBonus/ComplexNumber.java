package TpBonus;


public class ComplexNumber {
	public ComplexNumber(Boolean algeb, double firstEntry, double secondEntry)
	{
		set(algeb, firstEntry, secondEntry);
	}
	
	public void set(Boolean algeb, double firstEntry, double secondEntry)
	{
		if(algeb)
		{
			realPart = firstEntry;
			complexPart = secondEntry;
			
			updateToPol();
		}
		else
		{
			module = firstEntry;
			angle = secondEntry;
			
			updateToAlgeb();
		}		
	}
	
	public void updateToPol()
	{
		module = Math.sqrt(realPart*realPart + complexPart*complexPart);

		double retour = Math.atan(complexPart / realPart);
		
		if(realPart < 0)
		{
			retour += Math.PI;
		}
		
		if(retour < 0)
		{
			retour += 2*Math.PI;
		}
		
		angle = retour;
	}
	
	public void updateToAlgeb()
	{
		realPart = module * Math.cos(angle);
		complexPart = module * Math.sin(angle);
	}
	
	public double getReal()
	{
		return realPart;
	}
	
	public double getComplex()
	{
		return complexPart;
	}
	
	public double getModule()
	{
		return module;
	}
	
	public double getAngle()
	{
		return angle;
	}
	
	private double realPart;
	private double complexPart;
	
	private double module;
	private double angle;
}
