
import java.util.Scanner;
import java.util.ArrayList;

public class pembelian {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<penumpang> dataPenumpang = new ArrayList<>();
        ArrayList<penerbangan>dataPenerbangan = new ArrayList<>();
        
        dataPenerbangan.add(new penerbangan("GA022","Soekarno Hatta (CGK)","Changi International Airport","12:00","13:00", 100000));
        dataPenerbangan.add(new penerbangan("JT522","Adi Soemarmo (SOC)","Gusti Ngurah Rai","08:00","10:00", 600000));
        while (true) {
            System.out.println("1. Tampilkan daftar penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan pesanan tiket");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan menu : ");
            int pilihan = input.nextInt();
            System.out.println("===================================================");


            if (pilihan == 1) {  
                for (int i = 0; i < dataPenerbangan.size(); i++) {
                    System.out.println((i+1)+".");
                    dataPenerbangan.get(i).tampilpenerbangan();
                    System.out.println("===================================================");
                }  

            }else if (pilihan == 2){
                System.out.print("Masukkan NIK anda");
                input.nextLine();
                String NIK = input.nextLine();

                System.out.print("Masukkan Nama Depan anda : ");
                String namabel = input.nextLine();

                System.out.print("Masukkan Nama Belakang anda : ");
                String namadep = input.nextLine();

                System.out.println("Silahkan pilih data penerbangan : ");
                for (int i = 0; i < dataPenerbangan.size(); i++) {
                    System.out.println((i+1)+".");
                    dataPenerbangan.get(i).tampilpenerbangan();
                }

                System.out.print("Silahkan Pilih Tiket Penerbangan anda : ");
                int Pilihan1 = input.nextInt();

                penumpang datapassenger = new penumpang(NIK, namadep, namabel, Pilihan1);
                dataPenumpang.add(datapassenger);

                System.out.println("Tiket Berhasil dibeli");
                System.out.println("===================================================");

            }else if (pilihan == 3){
                if(dataPenumpang.isEmpty()){
                    System.out.println("Pembelian Tiket tidak ada !");
                }else  {
                    System.out.println("Pesanan Tiket : ");
                    for (int i = 0; i < dataPenerbangan.size(); i++) {
                    dataPenumpang.get(i).tampilPenumpang();
                }
                }
                System.out.println("===================================================");
            }
        }
    }
}
