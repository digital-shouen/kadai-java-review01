
public class IfElseIfSample {

    public static void main(String[] args) {
       int score;
       score = 80;
       
       if(score == 100) {
           System.out.println("満点");
       }
       else if(score >= 80 && score < 100) {
           System.out.println("合格");
       }
       else if(score > 80 && score >= 60) {
           System.out.println("及第点");
       }
       else {
           System.out.println("赤点");
       }         
       
       //if(score == 100) {
       //    System.out.println("満点です！");
       //}
       //else if(score >= 80) {
       //    System.out.println("合格です！");
       //}
       //else if(score >= 60){
       //    System.out.println("及第点です！");
       //}
       //else {
       //    System.out.println("赤点です！");
       //if(score >= 60) {
       //    System.out.println("ぼちぼち");
       //}
       //else if(score >= 80) {
       //    System.out.println("よくできました");
       //}
       //else if(score == 100) {
       //    System.out.println("満点");
       //}
       //else {
       //    System.out.println("再試");
       //}
    }
    }

