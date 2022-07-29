import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        String userName;
        String password;
        int right = 3;
        double balance = 1500.0;
        int action;

        while (right > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Username: ");
            userName = scanner.nextLine();

            System.out.print("Password: ");
            password = scanner.nextLine();

            if (userName.equals("abcd") && password.equals("1234")) {
                System.out.println("You have successfully logged into the system");
                do {
                    System.out.println("Select the action: ");
                    System.out.println("1-Deposit Money\n" +
                            "2-Withdraw Money\n" +
                            "3-Check Balance\n" +
                            "4-Log Out");
                    action = scanner.nextInt();
                }while (action != 4);
                break;
            } else {
                right--;
                System.out.println("Wrong username or password! Please try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact with 444 44 44");
                } else {
                    System.out.println("Your remaining right: " + right);
                }
            }

        }

    }
}
