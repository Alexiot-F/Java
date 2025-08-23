import java.io.*;
import java.lang.*;


 class plus{
		
	void OP(){
		int a=20, b= 10, c;
	System.out.println("Addition: "+ a +"+" +b+ " =" +  (a+b));
	System.out.println("Substraction: "+a+"-"+b+" =" +  (a-b));
	System.out.println("Multiplication: "+a+"*"+b+" =" +  (a*b));
	System.out.println("Division: "+a+"/"+b+" =" +  (a/b));
	System.out.println("Modulus: "+a+"%"+b+" =" +  (a%b));
 	}

		}
 
	public class addstatic{

		public static void main(String args[]){

				plus p=new plus();
				p.OP();
		}

}