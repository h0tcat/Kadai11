import java.util.Scanner;

public class Kadai11a{
  public static void main(String[] args){

    Scanner stdIO = new Scanner(System.in);
    int[] vals = new int[3];

    inputValues(vals, stdIO);
    double avg = average(vals[0], vals[1], vals[2]);
    System.out.println("ans : " + avg);
  }

  public static void inputValues(int[] vals, Scanner stdIO){
    
    System.out.print("x -->");
    vals[0] = stdIO.nextInt();
    System.out.print("y -->");
    vals[1] = stdIO.nextInt();
    System.out.print("z -->");
    vals[2] = stdIO.nextInt();
  }
  public static double average(int a, int b, int c){
    
    double avg = (double)(a + b + c) / 3;

    return avg;
  }
}
