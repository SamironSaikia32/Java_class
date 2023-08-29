package assignment;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4};
		double sum = 0;
		for(int i=0;i<4;i++)
			sum = array[i] + sum;
		System.out.println("Average of the array is :" + sum/4);
		

	}

}
