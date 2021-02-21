package lab1;
import java.util.*;

public class Sum_of_cubes {

	public static void main(String[] args) {
		
		System.out.println("Enter the number till which the sum of cube has to be calculated");
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int result = 0;
		for(int i=0;i<=num;i++)
		{
			result=num*num*num;
					
		}
		System.out.println("Sum of cubes is "+result);

	}

}
