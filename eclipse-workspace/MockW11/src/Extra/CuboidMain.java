package Extra;

public class CuboidMain {

	public static void main(String[] args) {
		Cuboid a=new Cuboid();
		a.showvalues();
		
		Cuboid b=new Cuboid();
		b.VolumeDt();
		System.out.println("cuboid volume_return datatypes:- "+ b.VolumeDt());
	
		
		Cuboid c=new Cuboid();
		c.VolumePar(10,07,10);
		
		Cuboid d=new Cuboid();
		d.VolumePar1(10,5,10);
		System.out.println("cuboid volume_return data types & parameters :- "+d.VolumePar1(10,5,10));
		
	}

}
