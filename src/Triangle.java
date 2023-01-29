
public class Triangle {

    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = 5;
        
        if(a == b && a == c && b == c) {
            System.out.println("正三角形");
        }
        else if(a == b || a == c || b == c) {
            System.out.println("二等三角形");
        }
        else {
            System.out.println("不等辺三角形");
        }
        }
}       

