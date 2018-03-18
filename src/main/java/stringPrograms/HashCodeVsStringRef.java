package stringPrograms;

public class HashCodeVsStringRef {

	public static void main(String[] args) {
		HashCodeVsStringRef obj = new HashCodeVsStringRef();
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());

	}
	
	
	public void objMethod() {
		
		System.out.println("This is Object method");
		
	}

}
