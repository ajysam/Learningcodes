package Extraquestions;
import java.util.*;

public class cities {

	public static void main(String[] args) {
		
		Map<String,String> obj=new HashMap();
		obj.put("GOA","goa");
		obj.put("KER","kerala");
		obj.put("GUJ","Gujarat");
		
		Set<Map.Entry<String,String>> values=obj.entrySet();
		for(Map.Entry<String,String> e:values)
		{
			System.out.print(e.getKey()+":"+e.getValue());
			
			
		}
		
	}

}
