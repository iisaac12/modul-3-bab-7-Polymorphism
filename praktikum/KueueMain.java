package praktikum;

public class KueueMain {
    public static void main(String[] args) {
        //membuat objek array listKue yang memiliki jumlah index 20 dari kelas Kue
        Kue[] listKue = new Kue[20];

        listKue[0] = new KueJadi("Kue Memek asli Aceh", 125000, 1);
        listKue[1] = new KueJadi("Krosang asli Paris", 50000, 10);
        listKue[2] = new KueJadi("Kue Hitam Legam", 69900, 1);
        listKue[3] = new KueJadi("Klepon Ponari Asli Jombang", 7800, 7);
        listKue[4] = new KueJadi("Kue Putu", 9000, 3);
        listKue[5] = new KueJadi("Kue Ambatukam", 90000, 3);
        listKue[6] = new KueJadi("Kue People Pleasure", 99999, 2);
        listKue[7] = new KueJadi("Brownies mas Anis", 16000, 10);
        listKue[8] = new KueJadi("Kue Ganjaran mas Ganjar", 28000, 12);
        listKue[9] = new KueJadi("Kue Buna Teddy mas Owo", 58000, 11);
        listKue[10] = new KuePesanan("Kue Kim Jong Un", 8000, 5);
        listKue[11] = new KuePesanan("Kue Bekasi rawan banjir mas Hazel", 5600, 2.5);
        listKue[12] = new KuePesanan("Kue Putih", 5000, 3);
        listKue[13] = new KuePesanan("Kue Ambalabubu", 7000, 1.5);
        listKue[14] = new KuePesanan("Kue Jawa", 9900, 1.4);
        listKue[15] = new KuePesanan("Kue Okedeh", 10000, 1.6);
        listKue[16] = new KuePesanan("Kue Okedeh Apa", 11000, 3.2);
        listKue[17] = new KuePesanan("Kue Gapapa", 7800, 3);
        listKue[18] = new KuePesanan("Kue Mulai", 20000, 2.3);
        listKue[19] = new KuePesanan("Kue Hehe", 8000, 2);

        System.out.println("<============================>");
        System.out.println("     Daftar Semua Kueue ");
        System.out.println("<============================>");
        System.out.println();

        //membuat objek kue dari class Kue
        //mengakses setiap indeks dari array listKue
        for (Kue kue : listKue){
            //memeriksa apakah objek kue merupakan instance dari KueJadi
            //jika iya, maka program akan lanjut
            //dan seterusnya
            if (kue instanceof KueJadi){
                System.out.println("Kue Jadi");
                System.out.println("<============================>");
            } else if (kue instanceof KuePesanan) {
                System.out.println("Kue Pesanan");
                System.out.println("<============================>");
            }

            System.out.println(kue);
            System.out.println("<============================>");
            System.out.println();
        }

        double totalHargaAllKue = 0;
        //membuat objek kue dari class Kue
        //mengakses setiap indeks dari array listKue
        for (Kue kue : listKue){
            //menambahkan setiap indeks yang sudah di hitung dengan method hitungHarga()
            //ke dalam variabel totalHargaAllKue
            totalHargaAllKue += kue.hitungHarga();
        }

        System.out.println("Total Harga Semua Kue: Rp. " + totalHargaAllKue);
        System.out.println("<============================>");
        System.out.println();


        double totalHargaJadi = 0;
        double totalJumlah = 0;
        
        //membuat objek kue dari class Kue
        //mengakses setiap indeks dari array listKue
        for (Kue kue : listKue){
            if (kue instanceof KueJadi) {
                //menambahkan setiap indeks yang sudah di hitung dengan method hitungHarga()
                //ke dalam variabel totalHargaJadi
                totalHargaJadi += kue.hitungHarga();
                //memanggil method getJumlah yang ada di class KueJadi
                //dan menambahkan tiap indeks ke dalam variabel totalJumlah
                totalJumlah += ((KueJadi) kue).getJumlah();
            }
        }

        System.out.println("Total Harga Kue Jadi : Rp. " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlah);
        System.out.println("<===============================>");
        System.out.println();

        //sama seperti yang KueJadi
        double totalHargaPesanan = 0;
        double totalBerat = 0;
        
        for (Kue kue : listKue){
            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
                totalBerat += ((KuePesanan) kue).getBerat();
            }
        }

        System.out.println("Total Harga Kue Pesanan: Rp. " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBerat);
        System.out.println("<===============================>");
        System.out.println();

        //Misalkan kueTermahal adalah kue yang ada di indeks pertama
        Kue kueTermahal = listKue[0];
        //mengakses tiap elemen kue yang ada di array listKue
        for (Kue kue : listKue){
            //jika harga kue saat ini lebih mahal dari kueTermahal yang sudah dihitung dengan method hitungHarga()
            if (kue.hitungHarga() > kueTermahal.hitungHarga()) {
                //maka kueTermahal ya kue saat ini
                //misal elemen pertama memiliki nama kue anis dengan harga 5500 di indeks [2]
                //kemudian dibandingkan dengan kue bowo yang harganya 6000 di indeks [3]
                //maka kueTermahal yakni kue bowo
                kueTermahal = kue;
            }
        }

        System.out.print("Kue dengan Total Harga Terbesar: ");
        if (kueTermahal instanceof KuePesanan) {
            System.out.println("Kue Pesanan");
        } else if (kueTermahal instanceof KueJadi){
            System.out.println("Kue Jadi");
        }

        System.out.println(kueTermahal);
        System.out.println("Harga Akhir: Rp. " + kueTermahal.hitungHarga());
        System.out.println("<===============================>");
    }
}
