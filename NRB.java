class BankAccount{
  private String name;
  private int balance;
   public void setname(String name){
    this.name = name;
   }
   public String getname(){
    return name;
   }
    public void setbalance(int balance){
    this.balance = balance;
   }
   public int getbalance(){
    return balance;
   }
}
public class NRB {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setname("Siddartha bank");
        ba.setbalance(500);

        System.err.println(ba.getname());
        System.err.println(ba.getbalance());
    }
}
