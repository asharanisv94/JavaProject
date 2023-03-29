package ontarioLicencePackage;

public class LicenceApproval {
	int age;
	String licenseLevel;
	String g1,g,g2;
	
	void checkEligibility()
	{
		if(age<16)
			System.out.println("Ineligible for Licence");
		else if(age>=16 && licenseLevel=="g1")
		System.out.println("Eligible for g2");
		else if(age>16&&licenseLevel=="g2")
		System.out.println("Eligible for g");
		else
			System.out.println("Invalid Entry");
		
		
	}
	

}
