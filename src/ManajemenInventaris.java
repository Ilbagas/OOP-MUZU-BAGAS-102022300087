
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananKering>daftarMakananKering=new ArrayList<>();
    ArrayList<MakananBasah>daftarMakananBasah=new ArrayList<>();

    public void tambahMakananKering() {
        Scanner input = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.print("Masukkan Nama Makanan : ");
        String namaMakanan = input.nextLine();

        System.out.print("Masukkan Jumlah Makanan : ");
        int jumlahMakanan = input.nextInt();

        System.out.print("Masukkan Harga Makanan : ");
        double hargaMakanan = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan Bahan Makanan : ");
        String bahanMakanan = input.nextLine();
        // Todo : Create a new object for MakananKering
        MakananKering makananKering = new MakananKering(namaMakanan, jumlahMakanan, hargaMakanan, bahanMakanan);
        daftarMakananKering.add(makananKering);
        
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.println("Makanan kering berhasil di tambahkan");
        
    }

    public void tambahMakananBasah() {
        Scanner input = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.print("Masukkan Nama Makanan : ");
        String namaMakanan = input.nextLine();

        System.out.print("Masukkan Jumlah Makanan : ");
        int jumlahMakanan = input.nextInt();

        System.out.print("Masukkan Harga Makanan : ");
        double hargaMakanan = input.nextDouble();
        input.nextLine();
        System.out.print("Masukkan Bahan Makanan : ");
        String bahanMakanan = input.nextLine();
        // Todo : Create a new object for MakananKering
        MakananBasah makananBasah = new MakananBasah(namaMakanan, jumlahMakanan, hargaMakanan, bahanMakanan);
        daftarMakananBasah.add(makananBasah);
        
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.println("Makanan kering berhasil di tambahkan");
    }
    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
            System.out.println("Tidak ada makanan disini");
        } else {
            // Todo : Create print notification for Makanan Kering  
            for (MakananKering makananKering : daftarMakananKering){
                makananKering.tampilDataKering();
            }
            for (MakananBasah makananBasah : daftarMakananBasah){
                makananBasah.tampilDataBasah();
            }
          
        }
    }

    
}
