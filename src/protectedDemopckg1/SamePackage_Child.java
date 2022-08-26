package protectedDemopckg1;

public class SamePackage_Child extends AccessModDemoClass_Parent {

	public static void main(String[] args) {
		AccessModDemoClass_Parent obj = new AccessModDemoClass_Parent();

		/*******Same Package, Child Class (Sub Class) - Private Variable not accessible*******/
		//uncomment below to check the variable accessible
		//System.out.println(obj.strDefaultString + "-" + obj.strPublicString + "-" + obj.strPrivateString + "-" + obj.strProtectedString);

	}

}
