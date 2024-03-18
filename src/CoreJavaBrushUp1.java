import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean mycard = true;
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		
		//or
		int[] arr2 = {1,2,3,4,5};
		System.out.println(arr2[3]);
		for(int i=0; i<arr2.length; i++) {
			System.out.println("i vale is "+ arr2[i]);
		}
		ArrayList arrlist = new ArrayList();
		
		
		System.out.println("*****************"); 
		//Converting Array to Array List
		String name[] = {"rahul", "shetty", "academy"};
		List<String> nameArrList = Arrays.asList(name);
		System.out.println(nameArrList.contains("academy"));
		//STRINGS

		System.out.println("*****************"); 
		String s = "RAhul Shetty Academy";
		String[] sarr = s.split("Shetty");
		System.out.println(sarr[0].trim());
		System.out.println(sarr[1].trim());
		
		
		
	}

}
