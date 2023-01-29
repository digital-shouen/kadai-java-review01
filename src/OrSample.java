
public class OrSample {

    public static void main(String[] args) {
        int scoreSansu;
        int scoreKokugo;
        scoreSansu = 80;
        scoreKokugo = 50;
        
        if(scoreSansu >= 60 && scoreKokugo >= 60) {
            System.out.println("合格");
        }
        else if(scoreSansu < 60 || scoreKokugo < 60) {
            System.out.println("補講1");
        }
        else {
            System.out.println("補講2");
        }
            
        }

    }
