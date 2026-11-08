public class UndoDepositLinkedDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(100);
        acc.deposit(50);
        acc.deposit(20);
        acc.deposit(30);
        acc.undoLastDeposit();
        acc.undoLastDeposit();
    }
}
class BankAccount{
    private double balance;
    LinkedStack<Double> history=new LinkedStack<>();
    BankAccount(double balance){
        this.balance=balance;
    }
    //deposit
    public void deposit(double amount){
        balance+=amount;
        history.push(amount);
        System.out.println("Deposit " + amount + " -> balance " + balance);
    }
    public void undoLastDeposit(){
        if(history.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }
        double last=history.pop();
        balance-=last;
        System.out.println("Undo " + last + " -> balance " + balance);
    }

}