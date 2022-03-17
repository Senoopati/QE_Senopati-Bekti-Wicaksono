public class no4 {
    static String ongkir(int panjang,int lebar,int tinggi,int berat){
        int tarif = 5000;
        int volume = panjang*lebar*tinggi;
        if (volume <= 50 && berat <= 1){
            return "Harga : " + tarif;
        }else{
            return "Harga : Rp. " + tarif*berat;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(ongkir(5, 2, 4, 1));
    }
}
