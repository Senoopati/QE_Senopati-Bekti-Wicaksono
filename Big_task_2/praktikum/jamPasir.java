public class jamPasir {
    static void cetakJamPasir(int n){
        int i, j, k;
         for (i = 1; i <= n; i++){
            for (k = 1; k <= i - 1; k++){
                System.out.print(" ");
            }
            for (j = 1; j <= n - i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--){
            for (k = 1; k <= i - 1; k++){
                System.out.print(" ");
            }
            for (j = i; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
            }
  }
    public static void main(String[] args) {
        cetakJamPasir(5);
    }
}
