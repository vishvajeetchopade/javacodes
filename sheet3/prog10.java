import java.io.*;
class core2web{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter a number");
		int x=Integer.parseInt(br.readLine());
		switch(x){
               case 1:System.out.println("jan");
		     break;
	       case 2:System.out.println("feb");
		 break;
	       case 3:System.out.println("mar");
		 break;
	       case 4:System.out.println("apr");
		 break;
	       case 5:System.out.println("may");
		break;
	       case 6:System.out.println("jun");
		break;
	       case 7:System.out.println("jul");
		break;
	       case 8:System.out.println("aug");
		break;
	       case 9:System.out.println("sept");
		break;
	       case 10:System.out.println("oct");
		 break;
	       case 11:System.out.println("nov");
		 break;
	       case 12:System.out.println("dec");
		 break;
	       default:System.out.println("month is not list");
		 break;
		}
	}
}	

	

	


	


