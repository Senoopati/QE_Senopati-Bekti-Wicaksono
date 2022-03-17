public class Problem5 {
    private static boolean primeNumber(int number) {
    int c=0;
    for (int i=1; i<=number; i++){
        int a=number % i;
        if(a==0){
            c=c+1;}
        }
        if(c==2){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11));
    }
}
