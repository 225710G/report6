package jp.ac.uryukyu.ie.e225710;

import java.util.Scanner;

/**
 * プレイヤーから3桁の数字を入力してもらい、その数字を分解してリスト化させるクラス。またはインタフェース。
 * 
 * @version 19.01
 * @author 225710G
 */
public class console {
    Scanner in = new Scanner(System.in);
    /**
     * @param input_number 空のリスト
     */
    String[] input_number = new String[3];
    /**
     * @param strnum 三桁の数字をいれる変数
     */
    String strnum;

    /**
     * プレイヤーに数字を入力してもらうメソッド
     */

    public void input() { 
        this.strnum = in.next();
    }

    /**
     * 数字の文章を文字別に分け、その文字たちでリストを作るメソッド
     */

    public void makelist() {
        input_number = strnum.split("");
    }

    /**
     * inputとchange_to_listのメソッドを合わせたメソッド
     * 
     * @return 三桁の数字を百の位、十の位、一の位に分解して作ったリスト。
     */
    public String[] insert() {
        input();
        makelist();
        return this.input_number;
    }

    /**
     * 
     * @return input関数で入力された3桁数のnum
     */
    public String return_num() {
        return this.strnum;
    }
}