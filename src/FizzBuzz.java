/**
 * Created by ymxing on 2/20/15.
 */
public class FizzBuzz {
    public void FizzBuzzCount(){
        for (int number=1;number<=100;number++){
            if (number%5==0 && number%3==0){
                System.out.println("FizzBuzz");
                continue;
            }
            if (number%5==0){
                System.out.println("Buzz");
                continue;
            }
            if (number%3==0){
                System.out.println("Fizz");
                continue;
            }
            System.out.println(number);
        }
    }

}
