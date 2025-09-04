package com.TCF.encapsulationjava;

public class encap {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		encapsulation e1 = new encapsulation();
			e1.setcId(42);
			e1.setName("Prashanth Arjun GK");
			e1.setAddress("Puducherry, Puducherry");
			System.out.println(e1.toString());
			encapsulation e2 = new encapsulation();
			e2.setcId(24);
			e2.setName("Karthik Raja R");
			e2.setAddress("Puducherry, Puducherry");
			System.out.println("\n"+e2.toString());
		}

}
