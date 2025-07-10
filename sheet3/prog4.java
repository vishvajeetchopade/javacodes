import java.util.*;
class core2web{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=sc.next().charAt(0);
		
				if(Character.isUpperCase(ch)){
			System.out.println(ch+"is uppercase");
		}
		else{
			System.out.println(ch+"is lowercase");
		}
	}
}

