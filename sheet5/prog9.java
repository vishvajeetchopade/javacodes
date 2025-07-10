import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter marks of first subject");
			int x=sc.nextInt();
			System.out.println("Enter marks of secondsubject");
			int y=sc.nextInt();
			System.out.println("Enter marks of third subject");
			int z=sc.nextInt();
			System.out.println("Enter marks of fourth subject");
			int s=sc.nextInt();
			System.out.println("Enter marks of fifth subject");
			int t=sc.nextInt();
			int add=0;
			System.out.println("Enter your operation");
			String operation=sc.next();
			switch(operation){
				case "addition":add=x+y+z+s+t;
						System.out.println(" addition is "+add);
						if(add>85){
							System.out.println("first class");
						}else if(add>75){
							System.out.println("second class");
						}
						else{
							System.out.println("fail");
						}
			}
		}
	}



