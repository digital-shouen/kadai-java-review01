
public class Review01 {
    public static void main(String[] args) {
        int num1 = 1500; //商品価格
        int result;
        result = taxMethod(num1);
        
        int result2 = num1 + result; //税込価格の計算(商品＋消費税)
        System.out.println("1500円の商品の税込価格は" + result2 +"円" +"（消費税は" + result +"円）です。" );
    }
    public static int taxMethod(int num1) {
        int result = num1 * 1/10; //消費税の計算
        return result;
    }
}
