import java.util.Scanner;
public class SqaureCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the width = ");
        double width = reader.nextDouble();
        System.out.println("Enter the height = ");
        double height = reader.nextDouble();

        System.out.println("Rectangle width = " + width);
        System.out.println("Rectangle height = " + height);

        double perimeter = 2 *(width + height);
        System.out.println("Rectangle perimter =" + perimeter);

        double area = (width * height);
        System.out.println("reactangle area = " + area);
    }
}
