package InheritanceConcept;

public class WhatappMain 
{
	public static void main(String[] args) 
	{
		
		//Multilevel inheritance-allow code separation for different versions and provide scope for new amendment
		
		System.out.println("Multilevel inheritance-allow code separation for different versions and provide scope for new amendments");
		System.out.println("-------------------------------");
		WhatappV4 w=new WhatappV4();
		w.text();
		w.audio();
		w.video();
		w.payment();
	}

}
