package dojo.plf;

/**
 * Main class for the package. 
 * If you want to run the application run this class.
 * 
 * @author Roy
 *
 */
public class Main {
	
	public static void main(String[] args) {
		System.out.println("#------------------------------Dojo Running--------------------------------------#");
		System.out.println("Creating address....");
		
		Address address = DojoFactory.createAddress("4","Skin Street","Newtown","Wellington","0000");
		System.out.print("Address test #1: ");
		System.out.println(address.toString());
		
		address.setBuildingName("Astrolobe House");
		address.setBuildingLevel("Level 4B");
		address.setBuildingSublocality("Unit 3");
		
		System.out.print("Address test #2: ");
		System.out.println(address.toString());
		System.out.println("#------------------------------Dojo Complete--------------------------------------#");		
		
	}

}
