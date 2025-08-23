import java.io.*;
import java.lang.*;
import java.util.*;

 class plus{
		
	void Add(){
		int c;
	Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Addition:" + a + "+" + b + "=" +(a+b));
		System.out.println("Substraction:" + a + "-" + b + "=" +(a-b));
		System.out.println("Multiplication:" + a + "*" + b + "=" +(a*b));
		System.out.println("Division:" + a + "/" + b + "=" +(a/b));
		System.out.println("Modulus:" + a + "%" + b + "=" +(a%b));	
	}
		}
 
	public class OPuser{

		public static void main(String args[]){

				plus p=new plus();
				p.Add();
		}

}