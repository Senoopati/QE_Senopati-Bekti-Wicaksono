import java.lang.Math;

public class Problem7 {
    private static int pangkat(int a, int b){
        int hasil = (int)Math.pow(a, b);
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println(pangkat(2, 3));
    }
}
