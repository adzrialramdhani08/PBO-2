// Kelas Buku

public class Buku {
    private String penulis;
    private String judul;
    private double harga;
    private int nomorPenerbit;

     // Konstruktor untuk menginisialisasi nilai penulis, judul, harga, dan nomor_penerbit
     
    public Buku(String penulis, String judul, double harga, int nomorPenerbit) {
        this.penulis = penulis;
        this.judul = judul;
        this.harga = harga;
        this.nomorPenerbit = nomorPenerbit;
    }

    // Metode untuk mendapatkan harga buku
 
    public double getHarga() {
        return harga;
    }
}