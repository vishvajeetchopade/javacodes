class c2w{
	public static void main(String[] args){
		char[] letters = {'C', 'B', 'A'};
        for (int i = 0; i < 3; i++) {
            // Print spaces for indentation
            for (int s = 0; s < i * 2; s++) {
                System.out.print(" ");
            }
            // Print letters starting from index i
            for (int j = i; j < 3; j++) {
                System.out.print(letters[j]);
	    
                if (j < 2) System.out.print(" ");
            }
            System.out.println();
        }
	}
}
}
