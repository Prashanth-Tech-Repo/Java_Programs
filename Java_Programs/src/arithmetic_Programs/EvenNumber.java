package arithmetic_Programs;

import java.util.Scanner;

public class EvenNumber {
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		
		EvenNumber obj = new EvenNumber();
		boolean isEvenNumber = obj.evenNumber(number);
		
		if(isEvenNumber)
		{
			System.out.println("Given number "+ number+" is even");
		}
		else
		{
			System.out.println("Given number "+ number+" is odd");
		}
		
		sc.close();
		
	}
	
	public boolean evenNumber(int number)
	{
		boolean isEvenNumber = false;
		
		if(number%2 == 0)
		{
			isEvenNumber = true;
		}
		return isEvenNumber;
	}
	

	
	

}
