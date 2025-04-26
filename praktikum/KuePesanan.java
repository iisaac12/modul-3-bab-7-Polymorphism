package praktikum;

public class KuePesanan extends Kue {
    private double berat;
    
    public KuePesanan(String nama, double harga, double berat){
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat(){
        return berat;
    }
    
    //memodifikasi method abstract
    //dengan memperbaharui nilai dari method hitungHarga(), sesuai dengan soalnya
    public double hitungHarga(){
        return getHarga() * berat;
    }

    public String toString(){
        return
        //memanggil method toString parent class dan menambahkan hal yang baru agar sesuai dengan tampilan yang diminta
        super.toString() +
                "\nBerat      : " + getBerat() +
                "\nTotal Harga: Rp. " + hitungHarga();
    }
}
