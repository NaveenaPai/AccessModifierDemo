package protectedDemopckg2;

import protectedDemopckg1.AccessModDemoClass_Parent;

public class DifferentPackage_ChildSubClass extends AccessModDemoClass_Parent {

	//String strProtectedString = "protected_child"; 
	
	
	public static void main(String[] args) {

		
		/*******Different Package - Default and Private not accessible*******/
		
		/* The protected members from parent class (AccessModDemoClass_Parent)
		 are inherited by the child class (DifferentPackage_ChildSubClass) and can access them as its own members. 
		But we can’t access these members using the reference of the parent class.
		They can be accessed only by using child class reference. .i.e. DifferentPackage_ChildSubClass */
		
		DifferentPackage_ChildSubClass obj = new DifferentPackage_ChildSubClass();

		//System.out.println(obj.strDefaultString + "-" + obj.strPublicString + "-" + obj.strPrivateString + "-"	+ obj.strProtectedString);
		System.out.println("Child Object -- String-->"	+ obj.strProtectedString);
		
		AccessModDemoClass_Parent  obj2 = new DifferentPackage_ChildSubClass();
		//System.out.println("Child object of type Parent -- String-->"	+ obj2.strProtectedString);	
		
		DifferentPackage_ChildSubClass obj3= (DifferentPackage_ChildSubClass)obj2;
		System.out.println("Child object of type Parent -- String-->"	+ obj3.strProtectedString);	
		

	}

}
