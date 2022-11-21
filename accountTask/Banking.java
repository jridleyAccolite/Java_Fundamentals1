package accountTask;

public class Banking {
        public static void main(String[] args){
            Account account = new Account();

            account.setAccountDetails(1234, "savings", 10000);

            System.out.println("initial state of account:");

            account.dispAccountDetails();

            account.deposit(1000);

            account.withdraw(2000);

            System.out.println("state of account after transactions:");

            account.dispAccountDetails();
        }
}
