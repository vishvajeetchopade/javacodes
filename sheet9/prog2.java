class c2w{
	public static void main(String[] args){
		int n=4;
		for(int i=1;i<=4;i++){
			if(i%2!=0){
			for(char ch='D';ch>='A';ch--){
				System.out.print(ch + " ");
			}
			}else{
				for(char ch='A';ch<='D';ch++){
					System.out.print(ch + " ");
				}
			}
			System.out.println();
		}
	}
}

