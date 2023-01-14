package jp.ac.uryukyu.ie.e225710;

import java.util.Arrays;

/**
 * プレイヤーが入力した答えとコンピューターが設定した答えを比較して情報を教えるクラス。
 */

public class compare_machine {
    /**
     * @param プレイヤーの答え
     */
    int[] input_number;
    /**
     * @param 答え
     */
    int[] answer_number;

    /**
     * @param if分が実行された回数をカウントする変数
     */
    int count = 0;
    /**
     * @param ストライクされた回数を表す変数
     */
    int Strike = 0;
    /**
     * @param ボールされた回数を表す変数
     */
    int Ball = 0;

    public compare_machine(int[] input_number, int[] answer_number) {
        this.input_number = input_number;
        this.answer_number = answer_number;
    }

    /**
     * プレイヤーが入力したリストと正解を比べてストライクやボール、アウトの回数を教えるメソッド。
     */
    public void compare() {
        for (int a = 0; a < 3; a++) {
            for (int i = 0; i < 3; i++) {
                if (a == i) {
                    if (this.answer_number[a] == this.input_number[i]) {
                        Strike++;
                    }
                }
            }
        }
        if (Strike == 3) {
            exit();
        }

        for (int a = 0; a < 3; a++) {
            for (int i = 0; i < 3; i++) {
                if (this.answer_number[a] == this.input_number[i]) {
                    count++;
                }
            }
            Ball = count - Strike;
        }

        if (Ball == 0 && Strike == 0) {
            System.out.println("Out!");
        } else {
            System.out.println("Strike : " + Strike + ", Ball : " + Ball);
        }
        System.out.println(Arrays.toString(answer_number));
    }

    /**
     * 3ストライクになるとメッセージを送り、プログラムを終了させるメソッド。
     */
    public void exit() {
        System.out.println("Congratulations! You cleared the game!");
        System.exit(0);
    }

}