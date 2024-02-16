package lesson_7;

/**
 * Класс описывающий банковский аккаунт
 */
public class BankAccount {

    private History[] histories = new History[10];
    private int historyCount;

    /**
     * Уникальный ID
     */
    private int id;

    /**
     * Уникальное имя
     */
    private String name;
    private double moneyAmount;


    public void printInfo(){
        System.out.printf("Аккаунт, идентификатор - %d, имя владельца - %s, остаток - %.2f\n", id, name, moneyAmount);
    }

    public void addMoneyToAccount(int money){ // Пополнить счет
        moneyAmount = moneyAmount + money;
        System.out.println("Счет успешно пополнен, остаток по счету: " + moneyAmount);
        histories[historyCount] = new History("Пополнение ", money);
        historyCount++;
    }

    public boolean getMoneyFromAccount (int money){ // Снять со счетa
        if (moneyAmount < money){
            System.out.println("Недостаточно средств!");
             return false;
        }
        moneyAmount = moneyAmount - money;
        System.out.println("Снятие успешно, остаток по счету: " + moneyAmount);
        histories[historyCount] = new History("Снятие ", money);
        historyCount++;
        return true;
    }

    public void sendMoneyFromAccountToAccount(BankAccount bankAccount, int money){
        if (getMoneyFromAccount(money)) {
            bankAccount.addMoneyToAccount(money);
            for (int i = histories.length - 1; i > 0; i--) {
                if (histories[i] != null){
                    histories[i].id = bankAccount.id;
                    break;
                }
            }
        }
    }





    // конструктор
    public BankAccount(int id, String name, double moneyAmount){
        this.id = id;
        this.name = name;
        this.moneyAmount = moneyAmount;
    }
    public BankAccount(){

    }

    public String getName() {
        return name;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

}
