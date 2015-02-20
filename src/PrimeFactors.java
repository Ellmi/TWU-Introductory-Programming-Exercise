/**
 * Created by ymxing on 2/20/15.
 */
public class PrimeFactors {
    public void generate(int n){
        System.out.print("numbers:");
        for(int i=1;i<n;i++){
            if(n%i==0 && isPrime(i)){
                System.out.print(i+",");
            }
        }
    }
    private boolean isPrime(long n) {
        if (n <= 3) {
            return n > 1;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        } else {
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }}
}
