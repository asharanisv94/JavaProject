package ontarioLicencePackage2;

public class ApprovalOfLicenseMain {

	public static void main(String[] args) {
		ApprovalOfLicense l= new ApprovalOfLicense();
		l.age=20;
		l.licenseLevel="g";
		l.checkEligibilityIf();
		l.age=16;
		//l.licenseLevel="g1";
		l.checkEligibilityIf();
		/*ApprovalOfLicense l2= new ApprovalOfLicense();
		l2.age=20;
		l2.licenseLevel="g2";
		l2.checkEligibilityIf();

		ApprovalOfLicense l3= new ApprovalOfLicense();
		l3.age=14;
		l3.checkEligibilityIf();

		ApprovalOfLicense l4= new ApprovalOfLicense();
		l4.age=17;
		l4.checkEligibilityIf();
		
		ApprovalOfLicense l5= new ApprovalOfLicense();
		l5.age=16;
		l5.checkEligibilityIf();*/


	}

}
