class c2w{
	public static void main(String[] args){
		int n=4;
		for(int i=n;i>=1;i--){
			for(int j=0;j<n;j++){
				System.out.print(((i+j)*n)+" ");
			}

			System.out.println();
		}
	}
}
