package day5;

class InsufficientBalance extends Exception{
    public InsufficientBalance(){
        super("Balance is insufficient, Cancelled");
    }
}

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int balance = 100000;
        int withdraw = 500000;
        try {
            if(balance < withdraw){
                throw new InsufficientBalance();
            }
            System.out.println("Under Process");
        }
        catch (InsufficientBalance e){
            System.out.println(e.getMessage());
        }

        System.out.println("Ended");
    }
}
