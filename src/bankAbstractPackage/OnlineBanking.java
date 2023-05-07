package bankAbstractPackage;

public class OnlineBanking extends BankOperations {

	public OnlineBanking(double initialDeposit) {
		super(initialDeposit);

	}

	@Override
	public void changePinPassword(String oldPassword, String newPassword) {
		if (newPassword.equals(oldPassword)) {
			System.out.println("Entered password same as old password.Try again and please enter a new password");
			System.exit(0);
			return;
		}
		if (newPassword.length() < 8 || newPassword.contains("&") || newPassword.contains("$")
				|| newPassword.contains("@")) {
			System.out.println(
					"\" ERROR!!!New password should be at least 8 characters long and should not contain &, $, or @.");
			System.exit(0);
			return;
		}
		System.out.println("Password changed successfully.Login again to continue transactions");
		System.out.println("____________________________________________");

	}
}