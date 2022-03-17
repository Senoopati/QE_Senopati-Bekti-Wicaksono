import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in );
        System.out.println("Masukkan angka");
        int bilangan = a.nextInt();
        int tambah = bilangan;
        for (int z = bilangan; z >= 1; z--) {
            tambah--;
            if (bilangan % tambah == 0) {
                System.out.print(tambah+ " ");
            }
        }
    }
}
