package CastingPractices;

public class ExplicitCastingPractices {

	public static void main(String[] args) {
		//Primitive Casting-2.ExplicitCasting
		//Data type converts from higher to lower-forcefully accepted
		
		double d=125.12678345;
		float f=(float) d;
		long l=(long) f;
		int i=(int) l;
		short s=(short) i;
		byte b=(byte) s;
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		//3.Boolean casting is not supported by java
	}
}
