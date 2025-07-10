
import java.io.*;
class core2web{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter a number");
		int x=Integer.parseInt(br.readLine());
		switch(x){
			case 1:System.out.println("moneday");
			       break;
			case 2:System.out.println("tuesday");
			      break;
			case 3:System.out.println("wednesday");
			      break;
                        case 4:System.out.println("thursday");
			      break;
                        case 5:System.out.println("friday");
			      break;
                        case 6:System.out.println("saturday");
			      break;
                        case 7:System.out.println("sunday");
		       	 break;
		    	default:System.out.println("day number must be in 1 to 7.");
				break;

		}
	}
}



