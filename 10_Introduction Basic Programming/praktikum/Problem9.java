public class Problem9 {
    private static void DrawXYZ(int n){
        for(int x = 1; x <= n ; x++){
            for(int y = 1; y <= n ; y++){
                if (y % 3 == 0){
                    System.out.print("X");
                }else if(y % 2 == 0){
                    System.out.print("Z");
                }else if(y % 2 == 1){
                    System.out.print("Y");
                }System.out.println("\n");
        }
    }
}

    public static void main(String[] args) {
        DrawXYZ(5);
    }
}
