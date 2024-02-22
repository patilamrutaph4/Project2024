package JavaBasics;

public class MultiDimentionalArray {
	public static void main(String[]args) {
		
		//Multi-Array Declaration
		
		int a[][]=new int[3][2];
		
		//Writing Array
		a[0][0]=1;
		a[0][1]=2;

		a[1][0]=5;
		a[1][1]=6;

		a[2][0]=9;
		a[2][1]=10;

	
		//Size of multi-array
		
		System.out.println("Row size :-" + a.length);
		System.out.println("Column size :-" + a[0].length);
		
		//Reading array
		for(int i=0;i<a.length;i++) { 
			
			for (int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
			
	}

}
