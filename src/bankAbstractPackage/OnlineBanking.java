package bankAbstractPackage;

public class OnlineBanking extends BankOperations {

	@Override
	public void changePinPassword(PersonAccount person, String oldPassword, String newPassword) {
		if (newPassword.equals(oldPassword)) {
			System.out.println("Entered password same as old password.Try again and please enter a new password");
			System.exit(0);
		} else if (newPassword.length() < 8 || newPassword.contains("&") || newPassword.contains("$")
				|| newPassword.contains("@")) {
			System.out.println(
					" ERROR!!!New password should be at least 8 characters long and should not contain &, $, or @.");
			System.exit(0);
		} else {
			person.setPassword(newPassword);
			System.out.println("Password changed successfully.Login again to continue transactions");
			System.out.println("____________________________________________");

		}
	}
}