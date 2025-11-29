import java.io.*;
import java.util.*;

class student{
		 student(){
				Scanner s=new Scanner(System.in);
					System.out.println("Enter Name: ");
					String N=s.nextLine();
					System.out.println("Enter Roll number: ");
					int id=s.nextInt();
					System.out.println("Enter Class: ");
					String C=s.nextLine();
					System.out.println("Name:"+N);
					System.out.println("Roll Number:"+id);
					System.out.println("Class:"+C);				
				
		}
	}
public class std{
	
		public static void main(String[] args){
				student S=new student();
		}
	}