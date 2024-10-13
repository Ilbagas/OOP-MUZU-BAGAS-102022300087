

public class penumpang {
    
    private String NIK_penumpang,namaDepan,namaBelakang;
    private int pilihantiket;
   

    public penumpang(String NIK_penumpang, String namaDepan, String namaBelakang,int pilihantiket){
        this.NIK_penumpang = NIK_penumpang;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.pilihantiket = pilihantiket;
    }
    public String getNIK(){
        return NIK_penumpang;
    }
    public String getnamaDepan(){
        return namaDepan;
    }
    public String getnamaBelakang(){
        return namaBelakang;
    }
    public int gettiket(){
        return pilihantiket;
    }
    public void tampilPenumpang(){
        System.out.println("NIK Penumpang : "+ NIK_penumpang);
        System.out.println("Nama Depan Penumpang : "+ namaDepan);
        System.out.println("Nama Belakang Penumpang : "+ namaBelakang);
        System.out.println("\n");
        if (pilihantiket==1){
            penerbangan data1 = new penerbangan("GA022","Soekarno Hatta (CGK)","Changi International Airport","12:00","13:00", 100000);
            data1.tampilpenerbangan();
        }else if (pilihantiket==2){
            penerbangan data2 = new penerbangan("JT522","Adi Soemarmo (SOC)","Gusti Ngurah Rai","08:00","10:00", 600000);
            data2.tampilpenerbangan();
        }
    }
    public static void main(String[] args) {;
        penumpang data = new penumpang("1020", "Ilham", "Bagaskara",1);
        data.tampilPenumpang();
    }
}
