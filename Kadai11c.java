import java.util.Scanner;

public class Kadai11c{
  public static void main(String[] args){
    int[] vals = new int[3];
    Scanner stdIO = new Scanner(System.in);

    for(int i = 0; i < vals.length; i++){
      System.out.print("整数値を入力してください --> ");
      vals[i] = stdIO.nextInt();
    }

    int max = max(vals[0], vals[1], vals[2]);
    int min = min(vals[0], vals[1], vals[2]);
    
    System.out.printf("最大値 : %d\n",max);
    System.out.printf("最小値 : %d\n",min);
  }

  public static int max(int a, int b, int c){
    int max = 0;
    max = a;
    if(b > max){
       max = b;
    }
    if(c > max){
       max = c;
    }

    return max;
  }

  public static int min(int a, int b, int c){
    int min = 0;

    min = a;
    if(b < min){
       min = b;
    }
    if(c < min){
       min = c;
    }

    return min;
  }
}
