class c2w{
	public static void main(String[] args){
		int n=4;
		
		for(int i=1;i<=n;i++){
			for(int j=(n-i);j>=1;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				if(i==1){
					System.out.print("D");
				}
				else if(i==2){
					System.out. print("C");
				}else if(i==3){
					System.out.print("B");
				}else {
					System.out.print("A");
				}


			
			}
			System.out.println();
		}
		
		     for(int i=n;i>=1;i--){
			for(int j=(n-i);j>=1;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				if(i==4){
					System.out.print("A");
				}
				else if(i==3){
					System.out.print("B");
				}else if(i==2){
					System.out.print("c");
				}else{
					System.out.print("D");

			}
						
		}
		System.out.println();
	}
}
}


