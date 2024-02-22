package JavaBasics;

public class Practice {
public static void main(String[] args) {
	
	
	//1. Array writing 
	
//	int b[]=new int[7];
//	
//	
//	b[0]=10;
//	b[1]=20;
//	b[3]=30;
//	b[4]=40;
//	b[5]=50;
//	b[6]=60;
//	
//	
//	System.out.println(" array length:=" +b.length);
//	
//	for(int c=0;c< b.length;c++) {
//		
//		System.out.println(b[c]);
//		
//	}
//	
	
	// 2.program
//	int a[]= {12,5,10,4,17,3,9,13,14};
//	
//	System.out.println("Array length:="+a.length);
//	
//	for(int i=0;i<a.length;i++)
//	{
//		System.out.print(a[i]+" ");
//	}
	
	
//	3. Multi-Array writing
//	
//	int d[][]=new int[2][3];
//	
//	d[0][0]=10;
//	d[0][1]=20;
//	d[0][2]=30;
//	d[1][0]=40;
//	d[1][1]=50;
//	d[1][2]=60;
//	
//	System.out.println("array row size:="+d.length);
//	System.out.println("array column size:-"+d[0].length);
//
//	for(int j=0;j<d.length;j++) {
//		for(int k=0;k<d[0].length;k++) {
//			System.out.print(d[j][k]+" ");
//		}
//		System.out.println();
//	}
//	

	
	
//4. Pattern Programming
//	*
//	**
//	***
	
//	for(int i=1;i<=3;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print("*");
//			}
//		System.out.println();
//	}
	
	//5.pattern programming
//	***
//	**
//	*
	
//	for(int a=1;a<=3;a++) {
//		
//		for(int b=3;b>=a;b--) {
//			System.out.print("*");
//		}
//	System.out.println();
//	
//	}	
	
	
	
	
	//6.pattern programming
//	*
//	**
//	***
//	**
//	*
	
//	for(int i=1;i<=3;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print("*");
//			}
//		System.out.println();
//	}
//		
//	for(int i=1;i<=3;i++) {
//		for(int j=2;j>=i;j--) {
//			System.out.print("*");
//			}
//		System.out.println();
//	}
//	
//		
	
	
	//7. Pattern programming
//	   *
//	   **
//	  ***
//	 ****
//	*****
	
//	for(int i=1;i<=5;i++) {
//		for(int j=4;j>=i;j--) {
//			System.out.print(" ");
//		}
//		
//	
//		for(int k=1;k<=i;k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	
	
	
	//8. just by adding single space with *, pyramid shape output will get created
	
	
//	for(int i=1;i<=5;i++) {
//		for(int j=4;j>=i;j--) {
//			System.out.print(" ");
//		}
//		
//	
//		for(int k=1;k<=i;k++) {
//			System.out.print(" *");
//		}
//		System.out.println();
//	}
	
	
	//9. just by adding single space with *, pyramid up and down shape output will get created
//    *
//   **
//  ***
// ****
//*****
//*   
//**  
//*** 
//****
//*****
//	
//	for(int i=1;i<=5;i++) {
//		for(int j=4;j>=i;j--) {
//			System.out.print(" ");
//		}
//		
//	
//		for(int k=1;k<=i;k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//
//	for(int i=1;i<=5;i++) {
//		
//		for(int k=1;k<=i;k++) {
//			System.out.print("*");
//		}
//		for(int j=3;j>=i;j--) {
//			System.out.print(" ");
//		}
//		
//		System.out.println();
//	}
	
	
	
	
	
	//10.pyramid up down
	
	
//    *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
 //   *
//	for(int i=1;i<=5;i++) {
//		for(int j=4;j>=i;j--) {
//			System.out.print(" ");
//		}
//		
//	
//		for(int k=1;k<=i;k++) {
//			System.out.print(" *");
//		}
//		System.out.println();
//	}
//
//	for(int i=1;i<=5;i++) {
//		
//		for(int j=1;j<=i;j++) {
//			System.out.print(" ");
//		}
//		
//		for(int k=4;k>=i;k--) {
//			System.out.print(" *");
//		}
//		
//		
//		System.out.println();
//	}
	
	
	
	
	//11
	for(int i=1;i<=5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print(" *");
		}
		
	
		for(int k=1;k<=i;k++) {
			System.out.print(" ");
		}
		System.out.println();
	}

	for(int i=1;i<=5;i++) {
		
		for(int j=0;j<=i;j++) {
			System.out.print(" *");
		}
		
		for(int k=5;k>=i;k--) {
			System.out.print(" ");
		}
		
		
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}




}
