package nestedInterface;

import nestedInterface.OuterInterface.InnerInterface;

public class MainClass {

	public static void main(String[] args) {
		
		
		ImplementationClass obj = new ImplementationClass();
		obj.innerInterfaceMethod();
		obj.outerInterfaceMethod();
		
		/*OuterInterface obj = new OuterInterface() {
			@Override
			public void outerInterfaceMethod() {
				System.out.println("This is anonymous class implementaion");
			};
		};
		obj.outerInterfaceMethod();

	}*/

	OuterInterface.InnerInterface obj1 = new InnerInterface() {
		
		@Override
		public void innerInterfaceMethod() {
			System.out.println("This is anonymous class implementation of Inner Interface");
			
		}
	};
	
	}
}