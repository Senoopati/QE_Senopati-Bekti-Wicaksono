import static java.lang.Math.sqrt;
public class no2 {
    static String volumeKubus(int sisi){
        return "Kubus : "+ sisi*sisi*sisi;
    }
    static String volumeBalok(int panjang,int lebar,int tinggi){
        return "Balok : "+ panjang*lebar*tinggi;
    }
    static String volumeTabung(int jari, int tinggi){
        return "Tabung : " + (int)(3.14*(jari*jari)*tinggi);
    }
   

    public static void main(String[] args) {
        System.out.println("Volume");
        System.out.println(volumeKubus(10));
        System.out.println(volumeBalok(3,6,10));
        System.out.println(volumeTabung(7,10));
    }
}
