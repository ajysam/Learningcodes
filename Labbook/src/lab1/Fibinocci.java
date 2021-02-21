package lab1;

import java.util.Scanner;

public class Fibinocci {

	public static void main(String[] args) {
		int num1=0,num2=1,num3;
		System.out.println("Enter the number till fibbinocci series has to appear");
		Scanner obj=new Scanner(System.in);
		int count=obj.nextInt();
		System.out.println("Fibbinocci series"+num1+" "+num2);
		for(int i=0;i<count;i++)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}
		
		
		
				
		
		
	}

}
