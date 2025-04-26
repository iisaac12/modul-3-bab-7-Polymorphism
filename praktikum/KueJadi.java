package praktikum;

public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah){
        super(nama, harga);
        this.jumlah = jumlah;
    }
    
    public double getJumlah(){
        return jumlah;
    }

    //memodifikasi method abstract
    //dengan memperbaharui nilai dari method hitungHarga(), sesuai dengan soalnya
    public double hitungHarga(){
        return getHarga() * jumlah * 2;
    }

    public String toString(){
        return
        //memanggil method toString parent class dan menambahkan hal yang baru agar sesuai dengan tampilan yang diminta
        super.toString() +
                "\nJumlah     : " + getJumlah() +
                "\nTotal Harga: Rp. " + hitungHarga();
    }
}
