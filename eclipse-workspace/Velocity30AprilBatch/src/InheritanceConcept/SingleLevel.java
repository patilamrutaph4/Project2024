package InheritanceConcept;

public class SingleLevel {
public static void main(String[] args) {
	//Parent class
	parent p=new parent();
	p.parent1();
	System.out.println("-------------------------------");
	
	//Single level inheritance
			System.out.println("Single level inheritance-child can aquire properties of parent");
			System.out.println("-------------------------------");
	
	//Child class
	child c=new child();
	c.parent1();
	c.child1();
}
	
}
