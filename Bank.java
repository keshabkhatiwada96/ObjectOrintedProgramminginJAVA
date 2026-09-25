class BalanceException extends Exception {

    BalanceException(String message) {
        super(message);
    }
}

public class Bank {

    public static void main(String[] args) {

        int balance = 50;

        try {
            if (balance < 0) {
                throw new BalanceException("Balance cannot be negative");
            }

            System.out.println("Valid balance");
        } catch (BalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}