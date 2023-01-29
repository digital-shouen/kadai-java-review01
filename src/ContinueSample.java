
public class ContinueSample {

    public static void main(String[] args) {
        // 検索対象のデータ・・・配列
        int[] targetArray = {37,85,64,57,98,100,47,23,71,69};
        
        //変数の宣言
        int count = 0;
        
        //配列要素を対象に探す
        for(int value : targetArray) {
            if(value < 60) {
                continue;
            }
            
            // 変数のカウントアップ
            count++;
        }
        
        System.out.println("60tenijyo" + count + "desu");
    }

}
