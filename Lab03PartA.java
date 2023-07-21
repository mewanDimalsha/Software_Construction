import java.util.Scanner;

public class Lab03PartA {
	  public static void main(String args[]) {
		//Implemnt Lab03PartA
		  
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter the number of rows your are going to enter(user input) =");
		  int n= sc.nextInt();
		 
		  int [][] numArray = new int[n][n];
		  
		  for (int i = 0; i < n; i++) {
			  for (int j = 0; j <=i; j++) {
				  
				  if (j==0) {
					  numArray[i][j]=(n*(n+1)/2)-i;
				}
				  else {
					  numArray[i][j]=numArray[i][j-1]-(n-j);
				}
				
			}
		}
		  for (int i = 0; i < n; i++) {
			  for (int j = 0; j <=i; j++) {
				  System.out.print(numArray[i][j]+"\t");
				
			}
			  System.out.println();
		}
	  }
	}
