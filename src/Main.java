// Don't delete any comments below!!!
// Todo: Import Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        Scanner input = new Scanner(System.in);
        ManajemenInventaris manajemenInventaris = new ManajemenInventaris();

        // Todo : Create Loop list menu
        while (true) {
            System.out.println("====================================");
            System.out.println("1. Tambah Makanan Kering");
            System.out.println("2. Tambah Makanan Basah ");
            System.out.println("3. Tampilkan Semua Makanan");
            System.out.println("4. Keluar ");
            System.out.print("Pilih Menu : ");
            int pilihan = input.nextInt();
            

            switch (pilihan) {
                case 1:
                    System.out.println("====================================");
                    manajemenInventaris.tambahMakananKering();
                    break;
                case 2 :
                    System.out.println("====================================");
                    manajemenInventaris.tambahMakananBasah();
                    break;
                case 3 : 
                    System.out.println("====================================");
                    manajemenInventaris.tampilkanSemuaMakanan();
                    break;
                default:
                    break;
            }
            if (pilihan==4){
                System.out.println("Keluar dari program");
                break;
            }

        }
    }
}
