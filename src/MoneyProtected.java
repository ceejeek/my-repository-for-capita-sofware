public class MoneyProtected {
    public static void main(String[] args) {
        int balance = 70000;
        // use if - else to determine whether the money is protected
        if (balance > 0 && balance < 85000)
        {
            System.out.println( "your money is protected");
        } else
        {
            System.out.println("your money is not protected");
        }
    }
}