package praktikum;
//mohon maaf kak, saya izin ga ngejelasin method setter getter dll yaa
//soalnya di materi-materi sebelumnya, sudah saya jelaskan🙏🙏🙏
//saya akan jelaskan yang menurut saya perluu dijelaskan
public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public double getHarga(){
        return harga;
    }

    public String toString(){
        //membuat tampilan
        return 
        String.format("Nama       : " + getNama() + 
                    "\nHarga      : Rp. " + getHarga());
    }

    //membuat method abstract agar dapat digunakan oleh class lain
    public abstract double hitungHarga();
}
