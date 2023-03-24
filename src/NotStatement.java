import java.util.Scanner;
public class NotStatement {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("what is the whether like today");
        String answer = reader.nextLine();

        if (!(answer.equals("rain"))){
            System.out.println("Take a walk with me");
        } else {
            System.out.println("Stay in bed");
        }
    }
}
