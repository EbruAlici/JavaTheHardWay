import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double i, lbs, bmi;

    System.out.print( "Your height (feet only) ");
    f = keyboard.nextDouble();

    System.out.print( "Your height in inches: " );
    i = keyboard.nextDouble();

    System.out.print( "Your weight in lbs: " );
    lbs = keyboard.nextDouble();

    bmi = (lbs*0.45359237) / ((i*0.0254)*(i*0.0254));

    System.out.println( "Your BMI is " + bmi );
  }
}
