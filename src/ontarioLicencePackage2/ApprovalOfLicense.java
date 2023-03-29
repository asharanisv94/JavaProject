package ontarioLicencePackage2;

public class ApprovalOfLicense {
	int age;
	String licenseLevel;
	String g1, g, g2;


	void checkEligibilityIf() {
		if (age >= 16) 
		{			 
			 if (licenseLevel==null)
				 System.out.println("eligible for g1");
			 
			 if (licenseLevel == "g1")
				System.out.println("eligible for g2");
			 
			 if ( licenseLevel == "g2")
				System.out.println("Eligible for g");

		}else
			System.out.println("Ineligible for Licence");

	}
}
