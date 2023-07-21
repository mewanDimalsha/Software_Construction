import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Lab03PartB {
    public static void main(String args[]) {
		//Implemnt Lab03PartB
	    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the alphebet=");
		int n = sc.nextInt();
		
		findAdjacentsByArray(n);
		
		findAdjacentsByMap(n);
	}
	
	public static void findAdjacentsByArray(int index) {
		//Implement Lab03PartB a 
		char[] strArray = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

				if (index==1) {
					System.out.println("<2,B>");
					
				}
				else if(index==26){
					System.out.println("<25,y>");
				}
				else if(index<1 || index>26){
					System.out.println("Enter a valid number");
					}
				else {
					System.out.println("<"+(index-1)+","+strArray[index-2]+">"+","+"<"+(index+1)+","+strArray[index]+">");
					
				}
	}
	
	public static void findAdjacentsByMap(int index) {
		//Implement Lab03PartB b
		char[] strArray = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		
		 Map<Integer, Character> hashMap = new HashMap<Integer, Character>();
		 
		 for (int i = 0; i < strArray.length; i++) {
			  
	            hashMap.put(i+1, strArray[i]);
	}
	
		 if (hashMap.containsKey(index)) {
			 if (index==1) {
					System.out.println("<2,B>");
					
				}
				else if(index==26){
					System.out.println("<25,y>");
				}
				else {
					System.out.println("<"+(index-1)+","+hashMap.get(index-1)+">"+","+"<"+(index+1)+","+hashMap.get(index+1)+">");
					
				}
		}
		 else {
			 System.out.println("Enter a valid number");
		}
}}
	
