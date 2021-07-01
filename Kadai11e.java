import java.util.Scanner;

public class Kadai11e{
  //なぜか、スネークケースになっている0u0
  public static int get_price(int code){
    int[] goods_code = {201, 202, 203, 204, 101, 102, 103, 104, 301, 302};
    int[] goods_price = {1200, 1300, 1100, 1900, 500, 200, 600, 400, 6800, 5700};

    for(int i = 0; i < goods_code.length; i++){
      if(goods_code[i] == code){
        return goods_price[i];
      }
    }

    return -1;
  }
  public static void main(String[] args){
    Scanner stdIO = new Scanner(System.in);
    
    System.out.print("商品番号 --> ");
    int code = stdIO.nextInt();
    int price = get_price(code);

    if(price == -1){
      System.out.println("エラー : 該当商品は未登録です。");
    }else{
      System.out.printf("単価 : %d\n",price);
    }
  }
}
