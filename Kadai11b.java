import java.util.Scanner;


public class Kadai11b{
  public static void main(String[] args){
    Scanner stdIO = new Scanner(System.in);

    System.out.print("底辺 --> ");
    int a = stdIO.nextInt();
    System.out.print("高さ --> ");
    int b = stdIO.nextInt();
    
    double triangle = area_of_triangle(a, b);
    System.out.println("三角形の面積 : " + triangle);

    System.out.print("半径 --> ");
    a = stdIO.nextInt();
    double circle = area_of_circle(a);
    
    System.out.println("円の面積 : " + circle);
  }

  public static double area_of_triangle(int a, int b){
    return (double) (a * b / 2);
  }
  public static double area_of_circle(int a){
    return (double) (a * a * 3.14);
  }
}
