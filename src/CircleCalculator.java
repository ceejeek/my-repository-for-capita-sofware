import java.sql.SQLOutput;

public class CircleCalculator {
    public static void main(String[] args) {

         double circleRadius = 12.0;
         double circleDiamter =  2 * (circleRadius);

         double circleArea = 3.14 * (circleRadius * circleRadius);

         double circleCircumference = 2 * 3.14 * (circleRadius);

        System.out.println("cicleDiamter = " + circleDiamter);
         System.out.println(" circleArea = " + circleArea);
         System.out.println("circleCircumference = " + circleCircumference);
    }
}
