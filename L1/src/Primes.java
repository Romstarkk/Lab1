public class Primes {
    public static void main(String[] arg){
        for(int i=2;i<101;i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }
    public static boolean isPrime(int x){
        for(int i=2;i<101;i++){
            if(i!=x){
                if(x%i==0)return false;
            }
        }
        return true;
    }
}
