package TpBonus;

public class Complex {
	
	public Complex(ComplexNumber a, ComplexNumber b){
		number1 = a;
		number2 = b;
	}
	
	public ComplexNumber addition(ComplexNumber a, ComplexNumber b){
		ComplexNumber result = new ComplexNumber(true, 0, 0);
		result.set(true, a.getReal() + b.getReal(), a.getComplex() + b.getComplex());
		//System.out.print("(" + a.getReal() + ")+(" + a.getComplex() + "i) + (" + b.getReal() + ")+(" + b.getComplex() + "i) = ");
		//System.out.print("(" + result.getReal() + ")+(" + result.getComplex() + "i)\n");
		return result;
	}
	
	public ComplexNumber soustraction(ComplexNumber a, ComplexNumber b){
		ComplexNumber result = new ComplexNumber(true, 0, 0);
		result.set(true, a.getReal() - b.getReal(), a.getComplex() - b.getComplex());
		System.out.print(a.getReal() + "+" + a.getComplex() + "i - " + b.getReal() + "+" + b.getComplex() + "i = ");
		System.out.print(result.getReal() + "+" + result.getComplex() + "i\n");
		return result;
	}
	
	public ComplexNumber multiplication(ComplexNumber a, ComplexNumber b){
		ComplexNumber result = new ComplexNumber(true, 0, 0);
		
		result.set(false, a.getModule() * b.getModule(), a.getAngle() + b.getAngle());
		//System.out.print("(" + a.getAngle() + "*" + b.getAngle() + "i) + (" + a.getModule() + "*" + b.getModule() + "i) = ");
		//System.out.print("(" + a.getReal() + "+" + a.getComplex() + "i) * (" + b.getReal() + "+" + b.getComplex() + "i) = ");
		//System.out.print(result.getReal() + "+" + result.getComplex() + "i\n");
		//System.out.print(result.getModule() + "+" + result.getAngle() + "i\n");
		return result;
	}
	
	public ComplexNumber division(ComplexNumber a, ComplexNumber b){
		ComplexNumber result = new ComplexNumber(true, 0, 0);
		if(b.getModule() == 0)
			System.out.print("Division par zero : ");
		result.set(false, a.getAngle() - b.getAngle(), a.getModule() / b.getModule());
		System.out.print("(" + a.getReal() + "+" + a.getComplex() + "i) / (" + b.getReal() + "+" + b.getComplex() + "i) = ");
		System.out.print(result.getReal() + "+" + result.getComplex() + "i\n");
		return result;
	}
	
	public int isMandelbrot(ComplexNumber c)
	{
		//System.out.println("Appel Function" + c.getReal() + " + " + c.getComplex() + "i");
		int iteration;
		ComplexNumber z = c;
		if(z.getModule() > 2)
		{
			return 0;
		}
		
		for (iteration = 1; iteration < 500; iteration ++)
		{
			z = addition( multiplication(z,z) , c);
			if(z.getModule() > 2)
			{
				return iteration;
			}
		}
		
		return -1;
	}
	
	private ComplexNumber number1;
	private ComplexNumber number2;
	
}
