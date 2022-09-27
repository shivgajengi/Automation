 
package qsp;
import java.util.Scanner;
public class A {
	 public static void main(String[] args) {
	  int a,b,c,d;
	  Scanner scan = new Scanner(System.in); 
	  System.out.println("enter the inputs:");
	  a = scan.nextInt();
	  b = scan.nextInt();
	  c = scan.nextInt();
	  d = scan.nextInt();
	  int[] array = {a,b,c,d};
	  int k = 0;
	  
	  for(int i=0; i<array.length; i++){
	  int n = array[i];
	  int x = n/3;
	  int y = n%3;
	  int z = x*35;

	   switch(y){
	   case 0: k = 0 + z; break;
	   case 1: k = 20 + z; break;
	   case 2: k = 30 + z; break;
	   case 3: k = 35 + z; break;  
	   }
	  System.out.println(k); 
	  }
	  }
	}


