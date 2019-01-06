public class HeronsFormula {
  public static void main(String[] args){
    double a, g;
    String tws = "A triangle with sides ";

    a = triangleArea(3, 3, 3);
    System.out.println("A triangle with sides 3,3,3 has area " + a);

    a = triangleArea(3, 4, 5);
    System.out.println("A triangle with sides 3,4,5 has area " + a);
    g = triangleArea(7, 8, 9);
    System.out.println(tws + "7,8,9 has area " + g);

    System.out.println(tws + "5,12,13 has area " + triangleArea(5, 12, 13));
    System.out.println(tws + "10,9,11 has area " + triangleArea(10, 9, 11));
    System.out.println(tws + "8,15,17 has area " + triangleArea(8, 15, 17));
    System.out.println(tws + "9,9,9 has area " + triangleArea(9, 9, 9));
}
    //this function computes the area of a triangle with side lengths a,b,c
    public static double triangleArea(int a, int b, int c) {
      double s, A;

      s = (a+b+c)/2.0;
      A = Math.sqrt(s*(s-a)*(s-b)*(s-c) );

      //after computing the area, you must "return" the computed value:
      return A;
    }

  }

  // 1: The one with a function is shorter
  // 2: I would have to fix it in several places instead of 1.
  // 3: I would have to define all the sides and add the math in. 
