package lesson_7;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setId(1);
        bankAccount.setName("Max");
        bankAccount.setMoneyAmount(10);

        BankAccount bankAccount1 = new BankAccount(2, "Alex", 15);
        BankAccount bankAccount3 = new BankAccount();

        bankAccount3 = bankAccount;

        bankAccount.printInfo();
        bankAccount.addMoneyToAccount(5); // положили деньги
        bankAccount.getMoneyFromAccount(5); // сняли деньги

        bankAccount.printInfo();
        bankAccount1.printInfo();
        bankAccount.sendMoneyFromAccountToAccount(bankAccount1, 10);
        bankAccount.printInfo();
        bankAccount1.printInfo();

        System.out.println();

    }
}
