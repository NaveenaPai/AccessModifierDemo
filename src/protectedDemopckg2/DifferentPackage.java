package protectedDemopckg2;

import protectedDemopckg1.AccessModDemoClass_Parent;

public class DifferentPackage {

	public static void main(String[] args) {
		AccessModDemoClass_Parent obj = new AccessModDemoClass_Parent();

		/*******Different Package - Only Public accessible*******/
		//uncomment below to check the variable accessible
		//System.out.println(obj.strDefaultString + "-" + obj.strPublicString + "-" + obj.strPrivateString + "-" + obj.strProtectedString);

	}

}
