import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your age?");
        String answer = reader.nextLine();
        int age = 10;
        if(age>0 && age<18){
            System.out.println("you are too young");
        }else if(age<=30){
            System.out.println("go on and enjoy the game");
        }else{
            System.out.println("True legend");
        }
    }
}
