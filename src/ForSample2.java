
public class ForSample2 {

    public static void main(String[] args) {
        // iの値が０から２１より小さい間、処理を繰り返す
        for(int i = 0;i < 21; i++) {
            //iの値が2で割り切れる時
            if(i % 2 == 0) {
                //iの値を表示
                System.out.println("i=" + i);
            }
        }

    }

}
