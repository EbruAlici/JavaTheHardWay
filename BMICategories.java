import java.util.Scanner;

public class BMICategories {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double  i, lbs, bmi;

    System.out.print( "Your height in inches: " );
    i = keyboard.nextDouble();

    System.out.print( "Your weight in lbs: " );
    lbs = keyboard.nextDouble();

    bmi = (lbs*0.45359237) / ((i*0.0254)*(i*0.0254));

    System.out.println( "Your BMI is " + bmi );
    


    System.out.print("BMI category: ");
    if ( bmi < 15.0) {
      System.out.println( "very severly underweight" );
    }
    else if ( bmi <= 16.0) {
      System.out.println( "severly underweight");
    }
    else if ( bmi < 18.5) {
      System.out.println( "underweight");
    }
    else if ( bmi < 25.0){
      System.out.println( "normal weight");
    }
    else if (bmi < 30.0) {
      System.out.println( "moderately obese");
    }
    else if (bmi < 40.0) {
      System.out.println( "Severly obese");
    }
    else {
      System.out.println( "very severly/\"morbidly\" obese");
    }
  }
}
