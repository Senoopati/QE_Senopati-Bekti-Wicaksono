public class Problem10 {
    private static void cetakTablePerkalian(int n){
        for(int x = 1; x <= n ; x++){
            for(int y = 1; y <= n ; y++){
                System.out.print(" " + x * y + "\t");
        }
        System.out.print("\n\n");
    }
}
public static void main(String[] args) {
        cetakTablePerkalian(5);
    }
}
