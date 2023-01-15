package jp.ac.uryukyu.ie.e225710;

import java.util.Random;

/**
 * Bulls and Cowsで問題として使う数字を作るクラス。
 * 
 * @version 19.01
 * @author 225710G
 */
public class number {
    Random random = new Random();
    /**
     * @param numberList 何数をリスト
     * 
     */
    int[] numberList;


    /**
     * 何数を三つ作り、それをリストの中に入れるメソッド
     */
    public void set_number() {
        this.numberList = new int[3];
        this.numberList[0] = random.nextInt(9);
        this.numberList[1] = random.nextInt(9);
        this.numberList[2] = random.nextInt(9);

        while (this.numberList[0] == this.numberList[1] || this.numberList[1] == this.numberList[2]
                || this.numberList[2] == this.numberList[0]) {
            this.numberList[0] = random.nextInt(9);
            this.numberList[1] = random.nextInt(9);
            this.numberList[2] = random.nextInt(9);
        }
    }

    /**
     * 初期化が済んだリストをリターンするメソッド。
     * 
     * @return 何数のリスト
     */
    public int[] return_number() {
        return numberList;
    }
}
