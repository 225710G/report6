import jp.ac.uryukyu.ie.e225710.*;
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
        number number = new number();
        console console = new console();
        number.set_number();// 何数生成
        int[] answer_number;
        answer_number = number.return_number();
        for (int i = 0; i < 9; i++) {
            System.out.println("Insert number.");
            compare_machine compare_machine = new compare_machine(console.insert(), answer_number);// 両数字を比べる機会に入れる。
            compare_machine.compare();// 比較はじめ＆結果
        }
        System.out.println("You lose");
    }
}