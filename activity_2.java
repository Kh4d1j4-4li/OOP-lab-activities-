class account{
    public int balance;

    public account () {
        balance=1000;
    }
    public account ( int b){
        balance=b;
    }
    public void display() {
        System.out.println("baalnce is:" + balance );
    }
    public void withdarwbalalnce( int b) {
        balance=balance - b;
    }
    public void depositbalance(int b) {
        balance=balance + b;
    }
}
public class activity_2 {
    public static void main(String [] args){
        account a1= new account();
        a1.withdarwbalalnce(500);
        a1.display();

        account a2=new account();
        a2.depositbalance(500);
        a2.display();
    }
}