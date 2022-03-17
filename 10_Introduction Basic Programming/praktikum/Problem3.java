import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in );
        System.out.println("Masukkan angka");
        int bilangan = a.nextInt();
        int tambah = 0;
        for (int z = 0; z <= bilangan; z++) {
            tambah++;
            if (bilangan % tambah == 0) {
                System.out.print(tambah+ " ");
            }
        }
    }
}

