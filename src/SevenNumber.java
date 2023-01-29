
public class SevenNumber {

    public static void main(String[] args) {
        // 7の倍数 7が入っている数
        for(int i = 0; i <= 100; i++) {
            if(i % 7 == 0 || i % 10 == 7 ||  i / 10 == 7) {
                // ７の倍数を求める式（余りゼロ）17、27〜97を戻る式（余り７）７０代を求める式
                System.out.println("clap!");
            }else {
                System.out.println(i);
            }
            
        }

    }

}
