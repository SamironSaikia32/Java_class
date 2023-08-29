package assignment;

public class twoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int twoArray[][] = {
				{30},
				{300, 500},
				{3000, 5000, 5000}
		};
		
		for(int i = 0; i < twoArray.length; i++) {
			for(int j = 0; j < twoArray[i].length; j++) {
				System.out.print(twoArray[i][j] + " ");
			}
			System.out.println(); //newline
		}
	}

}
