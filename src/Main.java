import jp.ac.uryukyu.ie.e225710.*;
import java.util.InputMismatchException;


/**
 * mainクラス
 */
public class Main {
    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("--------Bulls and Cows--------");

        number number = new number();
        console console = new console();
        number.set_number();// 何数生成
        int[] answer_number;
        answer_number = number.return_number();
        for (int i = 0; i < 9; i++) {
            try {
                System.out.println("Insert number.");
                compare_machine compare_machine = new compare_machine(console.insert(), answer_number);// 両数字を比べる機会に入れる。
                compare_machine.compare();// 比較はじめ＆結果
            } catch (InputMismatchException e) {
                System.out.println("You must insert three-digit number. ex)412, 019");
                console = new console();
                i--;
                // TODO: handle exception
            }

           
        }
            System.out.println("You lose");
        }
}