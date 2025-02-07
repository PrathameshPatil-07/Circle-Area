import java.util.Scanner;
class Area{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		//Circle
		System.out.println("Enter readious :");
		float r=sc.nextFloat();
		float p=22/7f;
		float peri=2*p*r;
		
		
		
		System.out.print("Perimeter of Circle is :" + peri);
