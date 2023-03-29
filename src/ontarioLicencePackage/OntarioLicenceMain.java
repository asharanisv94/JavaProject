package ontarioLicencePackage;

public class OntarioLicenceMain {

	public static void main(String[] args) {
	LicenceApproval licence=new LicenceApproval();
licence.age=20;
licence.licenseLevel="g1";
licence.checkEligibility();

licence.age=20;
licence.licenseLevel="g2";
licence.checkEligibility();

licence.age=14;

licence.checkEligibility();


licence.age=14;
licence.licenseLevel="g2";

licence.checkEligibility();


	
			

	}

}
