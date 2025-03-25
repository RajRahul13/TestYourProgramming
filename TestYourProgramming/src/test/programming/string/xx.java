package test.programming.string;

class A {
	   A() {
	       System.out.println("A's Constructor");
	   }
	}
	class B extends A {
	   B() {
	       System.out.println("B's Constructor");
	   }
	}
	class C extends B {
	   C() {
	       System.out.println("C's Constructor");
	   }
	}
	public class xx {
	   public static void main(String[] args) {
	       C obj = new C();
	   }
	}