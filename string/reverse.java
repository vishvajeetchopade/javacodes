import java.util.*;
class c2w{
	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String str=sc.next();
	StringBuffer sb=new StringBuffer(str);
	sb.reverse();
	System.out.println(sb);
	str=sb.toString();
	System.out.println(str);
	}
}


