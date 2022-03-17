import static java.lang.Math.sqrt;
public class no1 {
    static String luasPersegi(int sisi){
        return "Persegi : "+ sisi*sisi;
    }
    static String luasSegitiga(int alas,int tinggi){
        return "Segitiga : "+ 0.5*alas*tinggi;
    }
    static String luasPersegiPanjang(int panjang, int lebar){
        return "Persegi Panjang : " + panjang*lebar;
    }
    static String kelilingPersegi(int sisi){
        return "Persegi : "+ 4*sisi;
    }
    static String kelilingSegitiga(int alas,int tinggi){
        double samping = sqrt((alas*alas)+(tinggi*tinggi));
        return "Segitiga : "+ ((int)samping + alas +tinggi);
    }
    static String kelilingPersegiPanjang(int panjang, int lebar){
        return "Persegi Panjang : " + 2*(panjang+lebar);
    }



    public static void main(String[] args) {
        System.out.println("Luas");
        System.out.println(luasPersegi(4));
        System.out.println(luasSegitiga(3,4));
        System.out.println(luasPersegiPanjang(7,8));
        System.out.println("Keliling");
        System.out.println(kelilingPersegi(4));
        System.out.println(kelilingSegitiga(3,4));
        System.out.println(kelilingPersegiPanjang(7,8));
    }
}



