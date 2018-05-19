package nestedInterface;

class ImplementationClass implements OuterInterface.InnerInterface, OuterInterface {


	@Override
	public void innerInterfaceMethod() {
		System.out.println("This is implemenation method of innerInterfaceMethod");
		
	}

	@Override
	public void outerInterfaceMethod() {
		System.out.println("This is implementaion method of outerInterfaceMethod");		
	}

}
