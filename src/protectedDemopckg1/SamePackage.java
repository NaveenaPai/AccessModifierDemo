package protectedDemopckg1;

public class SamePackage {

	public static void main(String[] args) {
		AccessModDemoClass_Parent obj = new AccessModDemoClass_Parent();

		/*******Same Package - Private Variable not accessible*******/ 
		//uncomment below to check the variable accessible
		//System.out.println(obj.strDefaultString + "-" + obj.strPublicString + "-" + obj.strPrivateString + "-" + obj.strProtectedString);


	}

}
