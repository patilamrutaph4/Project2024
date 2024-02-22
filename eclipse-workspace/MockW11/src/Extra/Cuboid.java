package Extra;

public class Cuboid {
	 int l=10;
	 int b=11;
	 int h=10;
	
	public void showvalues() {
		System.out.println("length of cuboid:-"+ l);
		System.out.println("breadth of cuboid:-"+ b);
		System.out.println("height of cuboid:-"+ h);
		System.out.println("Volume of cuboid:- "+ l*b*h);
		// System.out.println("Circum:-"+ (2*(l*b+b*h+l*h)));
		
	} 
	
	public int VolumeDt () {
		return(l*b*h);
		//return(2*(l*b+b*h+l*h));
	}
	
	public void VolumePar(int x, int y, int z) {
	
		System.out.println("cuboid volume_return parameters :- "+(x*y*z));
	} 
	
	public int VolumePar1 (int p, int q, int r) {
		return(p*q*r);
		
	} 	
	
}
