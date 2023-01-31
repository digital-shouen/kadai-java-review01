
public class Review02 {

    public static void main(String[] args) {
      //1から100までの連続した整数を画面に表示
        for(int i = 1; i <= 100; i++ ) {
          
          if(i % 15 == 0)//整数が3で割り切れ、なおかつ5で割り切れる数なら "FizzBuzz" と表示
            System.out.println("FizzBuzz"); 
     
          else if(i % 3 == 0 )//整数が3で割り切れる数なら "Fizz" と表示
            System.out.println("Fizz");
     
          else if(i % 5 == 0 ) //整数が5で割り切れる数なら "Buzz" と表示
            System.out.println("Buzz"); 
     
          else
            System.out.println(i); //それ以外の数は、その数をそのまま表示
        }
}
}
