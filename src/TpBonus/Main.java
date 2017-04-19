package TpBonus;
import java.util.Scanner;

import javax.imageio.ImageIO;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;

	
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			
		if (args.length < 4)
		{
			//System.exit(1);
		}
		ComplexNumber number1 = new ComplexNumber(true, Double.parseDouble(args[0]), Double.parseDouble(args[1]));
		ComplexNumber number2 = new ComplexNumber(true, Double.parseDouble(args[2]), Double.parseDouble(args[3]));
		
		Complex myComplex = new Complex(number1, number2);
		
		/*
		myComplex.addition(number1, number2);		
		myComplex.soustraction(number1, number2);
		myComplex.multiplication(number1, number2);
		myComplex.division(number1, number2);
		*/
		
		/*
		//////QUESTION 2 :
		int iterationMax;
		String entry;
		Scanner scan = new Scanner(System.in);
		entry = scan.nextLine();
		iterationMax = Integer.parseInt(entry);
		
		ComplexNumber resultat = new ComplexNumber(true, 0, 0);
		ComplexNumber number3 = new ComplexNumber(true, 0, 0);
		
		for(int compteur = 0; compteur < iterationMax; compteur++)
		{
			number3.set(false, 1, (compteur*2*Math.PI)/iterationMax);
			resultat = myComplex.addition(resultat, number3);
		}
		*/
		
		////////Question 3 :
		
		///test: : :
		ComplexNumber c = new ComplexNumber(true, 1, 0);
		int iterations;
		//System.out.print("Iterations de mandelbrot : " + myComplex.isMandelbrot(c));  
		System.out.println("Start");
		
		BufferedImage mandelbrotImage = new BufferedImage(15000, 10000, BufferedImage.TYPE_INT_RGB);
		
		for(int weidth = 0; weidth < 15000; weidth++)
		{
			for(int hight = 0; hight < 10000; hight++)
			{
				c.set(true, (double)(-2 + (weidth * 0.0002)), (double)(-1 + (hight * 0.0002)));
				iterations = myComplex.isMandelbrot(c);
				if(iterations == -1)
				{
					mandelbrotImage.setRGB(weidth, hight, 0);
				}
				else
				{
					mandelbrotImage.setRGB(weidth, hight, 16777215);
				}
				
			}
		}
		System.out.println("Finished");
		File outputfile = new File("saved.png");
	    
		try 
		{
			ImageIO.write(mandelbrotImage, "PNG", outputfile);
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		}catch (Throwable e)
		{
			
		}
	    
	}

}
