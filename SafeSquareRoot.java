import java.util.Scanner;

public class SafeSquareRoot {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String z;

    z = "YES";
    System.out.print( "Are you ready?!? ");
    z = keyboard.next();

    while ( ! z.equals("YES")) {
      System.out.print("Type 'YES' when you are ready: ");
      z = keyboard.next();
    }

    System.out.print("Give me a numberm and I'll find its square root. ");
    System.out.print("(No negatives, please.)");
    x = keyboard.nextDouble();

    while ( x < 0 ) {
      System.out.println("I won't take the square root of a negative. ");
      System.out.print("\nNew number: ");
      x= keyboard.nextDouble();
    }
    y= Math.sqrt(x);

    System.out.println("The square root of "+x+" is "+y);

  }
}
