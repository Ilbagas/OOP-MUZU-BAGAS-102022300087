public class penerbangan {
    private String nomorpenerbangan,bandaraKeberangkatan,bandaraTujuan,waktuKeberangkatan,waktuKedatangan;
    private float hargaTiket;
    
    public penerbangan( String nomorpenerbangan, String bandaraKeberangkatan, String bandaraTujuan, String waktuKeberangkatan, String waktuKedatangan, float hargaTiket){
        this.nomorpenerbangan = nomorpenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
        this.hargaTiket = hargaTiket;
    }
    public String getnomorpenerbangan(){
        return nomorpenerbangan;
    }
    public String getbandaraKeberangkatan(){
        return bandaraKeberangkatan;
    }
    public String getbandaraTujuan(){
        return bandaraTujuan;
    }
    public String getwaktuKeberangkatan(){
        return waktuKeberangkatan;
    }
    public String getwaktuKedatangan(){
        return waktuKedatangan;
    }
    public float gethargaTiket(){
        return hargaTiket;
    }
    public void tampilpenerbangan(){
        System.out.println("Nomor penerbangan : "+ nomorpenerbangan);
        System.out.println("Bandara Keberangkatan : "+bandaraKeberangkatan);
        System.out.println("Bandra Tujuan : "+ bandaraTujuan);
        System.out.println("Waktu Keberangkatan " + waktuKeberangkatan);
        System.out.println("Waktu Kedatangan : "+ waktuKedatangan);
        System.out.println("Harga tiket : "+ hargaTiket);
    }

    public static void main(String[] args) {
        System.out.println("1.");
        penerbangan data1 = new penerbangan("GA022","Soekarno Hatta (CGK)","Changi International Airport","12:00","13:00", 100000);
        penerbangan data2 = new penerbangan("JT522","Adi Soemarmo (SOC)","Gusti Ngurah Rai","08:00","10:00", 600000);
        data1.tampilpenerbangan();
    }
}
