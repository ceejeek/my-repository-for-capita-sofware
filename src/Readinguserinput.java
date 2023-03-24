import java.util.Scanner;

public class Readinguserinput {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter username : ");
        String userName = reader.nextLine();

        System.out.println("Enter your password :");
        int userPassword = reader.nextInt();

        System.out.println("Your user name is : " + userName);
        System.out.println("Your password is : " + userPassword);

    }
}
