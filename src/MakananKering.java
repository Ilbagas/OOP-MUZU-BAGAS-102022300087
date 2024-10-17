public class MakananKering {
    private String nama;
    private int jumlah;
    private double harga;
    private String bahan;

    public MakananKering(String nama, int jumlah, double harga, String bahan){
        this.nama = nama ;
        this.jumlah = jumlah;
        this.harga = harga;
        this.bahan = bahan;
    }
    public String getNama(){
        return nama;
    }
    public int getJumlah(){
        return jumlah;
    }
    public double getHarga(){
        return harga;
    }
    public String getBahan(){
        return bahan;
    }
    public void setNamaMakanan(String nama){
        this.nama = nama ;
    }
    public void setJumlahMakanan(int jumlah){
        this.jumlah = jumlah;
    }
    public void setHargaMakanan(double harga){
        this.harga = harga;
    }
    public void setBahanMakanan(String bahan){
        this.bahan = bahan;
    }
    public void tampilDataKering(){
        System.out.println("Nama makanan : "+nama);
        System.out.println("Jumlah makanan : "+ jumlah);
        System.out.println("Harga makanan : "+ harga);
        System.out.println("Bahan makanan : "+ bahan);
    }
    
}