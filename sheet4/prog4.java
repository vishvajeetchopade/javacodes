import java.util.*;

class c2w{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter percentage");
			double x=sc.nextDouble();
			
			if(x > 85){
				System.out.println("choose medical field");
			}else if(x > 75){
				System.out.println("choose engineering field");
			}else{
				System.out.println("choose pharmacy");
			}
		}
	}



