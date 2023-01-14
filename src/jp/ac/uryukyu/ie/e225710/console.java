package jp.ac.uryukyu.ie.e225710;
import java.util.Scanner;

/**
 * プレイヤーから3桁の数字を入力してもらい、その数字を分解してリスト化させるクラス。またはインタフェース。
 * @version 19.01
 * @author 225710G
 */
public class console {
    Scanner in = new Scanner(System.in);
    /**
     *　@param input_number 空のリスト
     */
    int[] input_number = new int[3]; 
    /**
     * @param num 三桁の数字をいれる変数
     */
    int num;
    /**
     * プレイヤーに数字を入力してもらい、リストに変えるメソッド
     */

    public void input() {
        this.num = in.nextInt();
        change_to_list(this.num);
    }

    /**
     * 
     * 三桁の数字を百の位、十の位、一の位に分解してリストに入れるメソッド
     */
    public void change_to_list(int num){
    
      this.input_number[2] = num % 10;
      this.input_number[1] = num % 100 / 10;
      this.input_number[0] = num % 1000 / 100;
    }

    /**
     * inputとchange_to_listのメソッドを合わせたメソッド
     * @return　三桁の数字を百の位、十の位、一の位に分解して作ったリスト。
     */
    public int[] insert(){
        input();
        return this.input_number;
    }

}
