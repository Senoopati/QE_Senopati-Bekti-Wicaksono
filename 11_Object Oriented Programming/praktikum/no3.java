public class no3 {
    static String Penjumlahan (int a, int b){
    return "Penjumlahan : " + (a + b);
    }
 
    static String Perkalian (int a, int b){
    return "Penkalian : "+(a * b);
    }
 
    static String Pengurangan (int a, int b){
    return "Pengurangan : "+(a - b);
    }
 
    static String Pembagian (int a, int b){
    return "Pembagian : "+(a / b);
    }

    public static void main(String[] args) {
        System.out.println(Penjumlahan(3,4));
        System.out.println(Pengurangan(15, 4));
        System.out.println(Perkalian(10,10));
        System.out.println(Pembagian(12,3));
    }
}
