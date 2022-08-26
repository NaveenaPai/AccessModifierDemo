package protectedDemopckg1;

public class AccessModDemoClass_Parent {

	String strDefaultString = "defaultString";
	public String strPublicString = "publicString";
	private String strPrivateString = "privateString";
	protected String strProtectedString = "protectedString";

	public static void main(String[] args) {

		AccessModDemoClass_Parent obj = new AccessModDemoClass_Parent();

		/*******Same Class - all variables accessible*******/
		System.out.println(obj.strDefaultString + "-" + obj.strPublicString + "-" + obj.strPrivateString + "-" + obj.strProtectedString);

	}

}
