package lab1;
import java.util.Scanner;

public class Trafficlight {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Print the Traffic light(red, yellow or green)");
		String light=sc.next();
		if(light.contains("red")) {
			System.out.println("Stop");
		}
		else if(light.contains("yellow")) {
			System.out.println("wait");
		}
		else if(light.contains("green"))
	{
	System.out.println("go");
	}

}
}