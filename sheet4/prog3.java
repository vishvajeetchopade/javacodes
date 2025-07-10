import java.util.*;
class core2web{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		       System.out.println(ch+"is vowel");
		}else if(Character.isLetter(ch)){
			System.out.println(ch+"is consonsnt");
		}
		else{
			System.out.println(ch+"is invalid character");
		}
	}
}


