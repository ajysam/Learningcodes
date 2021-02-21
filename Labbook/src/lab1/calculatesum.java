package lab1;
import java.util.*;

public class calculatesum{
	
public static int Calculatesum() {
}
{
	int sum=0;
	for(int i=0;i<=n;i++)
	{
	if(i%5==0||i%3==0)
		sum=sum+i;
	}
	return sum;
}
	
public static void main(String[]args) {
	
	System.out.println("Print the value");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Calculatesum();
	System.out.println("The values are"+sum);
	
	
}
}




	
	

