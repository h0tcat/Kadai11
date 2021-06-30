import java.util.Scanner;

public class Kadai11d{


  //こういった書き方も可能
  static Scanner stdIO;


  public static void main(String[] args){
    
    stdIO = new Scanner(System.in);
    int[] vals = new int[2];
    
    for(int i = 0; i < vals.length; i++){
      vals[i] = input_num();
    }

    double result = div(vals[0],vals[1]);
    System.out.println("除算結果 : "+result);
  }

  public static int input_num(){
    System.out.print("整数値を入力してください --> ");

    //----- 学習 MEMO -----
    //
    //C言語だとreturnされるときにsrcが解放されて
    //大変なことが起きることがある
    //C言語やC++だとmallocを使ったりすること
    //
    //---------------------
    
    int src = stdIO.nextInt();

    return src;
  }

  public static double div(int a, int b){
    if(b == 0){
      System.out.println("エラー: 0で除算しました");
      return -1;
    }else{
      return a / b;
    }
  }
}
